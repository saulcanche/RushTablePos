
package Controlador;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import modelo.Mesero;

public class ticketControlador {
    Mesero actual = (Mesero)main.restaurante.getEmpleado(main.idActual);
    DefaultListModel modeloLista = new DefaultListModel();
    
    public void listaCuentas(JList objetivo){
        
        for(int i = 0; i < actual.getCuentasAbiertas().size(); i++){
            modeloLista.addElement("a");
        }
        
        objetivo.setModel(modeloLista);
    }
}
