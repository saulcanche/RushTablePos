
package Controlador;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Cuenta;
import modelo.Empleado;
import modelo.Mesero;

/**
 *
 * @author Octavio
 */
public class meseroControlador {
    Mesero actual = (Mesero)main.restaurante.getEmpleado(main.idActual);
    DefaultListModel modeloLista = new DefaultListModel();
    
    public void listaCuentas(JList objetivo){
        modeloLista.removeAllElements();
        
        for(int i = 0; i < actual.getCuentasAbiertas().size(); i++){
            modeloLista.addElement(actual.getCuentasAbiertas().get(i).getMesa());
        }
        
        objetivo.setModel(modeloLista);
    }
    
    public void listaTickets(JTable tablaPedidos){
        Vector<String> titulos = new Vector<String>();
        Vector<Vector<Object>> data = new Vector<Vector<Object>>();
        
        titulos.add("Nombre");
        titulos.add("Mesa");
        titulos.add("Costo");
        titulos.add("Estado");
        
        for(int i=0; i<actual.getItemsVendidos().size(); i++){
            if(actual.getItemsVendidos().get(i).getStatus()!=3){
                Vector<Object> filas = new Vector<Object>();
                filas.add(actual.getItemsVendidos().get(i).getNombre());
                filas.add(actual.getItemsVendidos().get(i).getMesa());
                filas.add(actual.getItemsVendidos().get(i).getPrecio());
                switch (actual.getItemsVendidos().get(i).getStatus()) {
                    case 0:
                        filas.add("Preparacion");
                        break;
                    case 1:
                        filas.add("Listo");
                        break;
                    case 2:
                        filas.add("Cancelado");
                        break;
                    default:
                        throw new AssertionError();
                }
                data.add(filas);
            }
        }
        
        DefaultTableModel modelPedidos = new DefaultTableModel(data,titulos);
        tablaPedidos.setModel(modelPedidos);
    }
    
    public void cerrarCuenta(int index, JTable tabla, JList lista){
        
        
        for(int i = 0; i < actual.getItemsVendidos().size(); i++){
            if(index==actual.getItemsVendidos().get(i).getMesa()){
                
                if(actual.getItemsVendidos().get(index).getStatus()==0){
                    JOptionPane.showMessageDialog(null, "Alimentos aun no terminados", "Error", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    actual.getItemsVendidos().get(index).setStatus(3);
                    
                   actual.getCuentasAbiertas().remove(index);
                   listaCuentas(lista);
                   listaTickets(tabla);   
                }
            }
        }
    }
}
