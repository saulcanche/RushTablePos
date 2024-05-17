
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
            modeloLista.addElement(actual.getCuentasAbiertas().get(i).getId());
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
                filas.add(actual.getItemsVendidos().get(i).getId());
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
        int contador = 0;
        boolean borrar = false;
        
        for(int i = 0; i < actual.getItemsVendidos().size(); i++){
            if(index==actual.getItemsVendidos().get(i).getMesa()&&actual.getItemsVendidos().get(i).getStatus()!=3){
                contador++;
                if(actual.getItemsVendidos().get(i).getStatus()==0){
                    JOptionPane.showMessageDialog(null, "Alimentos aun no terminados", "Error", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }else{
                    actual.getItemsVendidos().get(i).setStatus(3);
                    borrar = true;
                }
            }
        }
        
        if(contador==0){
            JOptionPane.showMessageDialog(null, "La cuenta no tiene ordenes registradas");
        }
        if(borrar){
            actual.getCuentasAbiertas().remove(index);
            listaCuentas(lista);
            listaTickets(tabla);   
            actualizarCuentas(index);
        }
    }
    
    public void actualizarCuentas(int index){
        int indexActual;
        for(int i =0;i<actual.getItemsVendidos().size();i++){
            indexActual = actual.getItemsVendidos().get(i).getMesa();
            if(indexActual==index){
                actual.getItemsVendidos().get(i).setMesa(indexActual-1);
            }
        }
    }
}
