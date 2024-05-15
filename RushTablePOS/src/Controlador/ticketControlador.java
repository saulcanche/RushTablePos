
package Controlador;

import Vista.meseroForm;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import modelo.Cuenta;
import modelo.Mesero;
import modelo.ItemMenu;

public class ticketControlador {
    Mesero actual = (Mesero)main.restaurante.getEmpleado(main.idActual);
    DefaultListModel modeloLista = new DefaultListModel();
    
    public void listaCuentas(JList objetivo){
        modeloLista.removeAllElements();
        
        for(int i = 0; i < actual.getCuentasAbiertas().size(); i++){
            modeloLista.addElement(actual.getCuentasAbiertas().get(i).getId());
        }
        
        objetivo.setModel(modeloLista);
    }
    
    public void agregarMesa(int mesa){
        Cuenta nuevacuenta = new Cuenta(mesa, LocalDate.MAX, LocalTime.MIN);
        actual.agregarCuenta(nuevacuenta);
    }
    
    public void agregarItem(String nombre, String categoria, String descripcion, double precio, int idCuenta, int index){
        ItemMenu item = new ItemMenu(nombre,categoria,descripcion,precio,idCuenta);
        actual.getCuentasAbiertas().get(index).agregarItemCuenta(item);
        actual.agregarItem(item);
    }
    
}
