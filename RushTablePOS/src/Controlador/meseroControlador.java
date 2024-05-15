
package Controlador;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JList;
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
        
        for(int i=0; i<actual.getItemsVendidos().size(); i++){
            
            if(actual.getItemsVendidos().get(i).getStatus()==false ){
                Vector<Object> filas = new Vector<Object>();

                filas.add(actual.getItemsVendidos().get(i).getNombre());
                filas.add(actual.getItemsVendidos().get(i).getMesa());
                filas.add(actual.getItemsVendidos().get(i).getPrecio());

                data.add(filas);
            }
            
        }
        
        DefaultTableModel modelPedidos = new DefaultTableModel(data,titulos);
        tablaPedidos.setModel(modelPedidos);
    }
    
    public void cerrarCuenta(int index, JTable tabla){
        Cuenta cuenta = actual.getCuentasAbiertas().get(index);
        for(int i = 0; i < actual.getItemsVendidos().size(); i++){
            if(cuenta.getId()==actual.getItemsVendidos().get(index).getMesa()){
                actual.getItemsVendidos().get(index).setStatus(true);
            }
        }
        
        listaTickets(tabla);
    }
}
