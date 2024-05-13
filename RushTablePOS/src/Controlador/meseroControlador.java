
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
        //String lista[] = null;
        //ArrayList<Cuenta> copia = actual.getCuentasAbiertas();
        
        for(int i = 0; i < actual.getCuentasAbiertas().size(); i++){
            modeloLista.addElement("a");
        }
        
        objetivo.setModel(modeloLista);
    }
    
    public void listaTickets(JTable tablaPedidos){
        Vector<String> titulos = new Vector<String>();
        Vector<Vector<Object>> data = new Vector<Vector<Object>>();
        
        titulos.add("Nombre");
        titulos.add("Mesa");
        titulos.add("Estado");
        
        for(int i=0; i<actual.getItemsVendidos().size(); i++){
            Vector<Object> filas = new Vector<Object>();
            
            filas.add(actual.getItemsVendidos().get(i).getNombre());
            filas.add(actual.getItemsVendidos().get(i).getMesa());
            filas.add(actual.getItemsVendidos().get(i).getStatus());
            
            data.add(filas);
        }
        
        DefaultTableModel modelPedidos = new DefaultTableModel(data,titulos);
        tablaPedidos.setModel(modelPedidos);
    }
}
