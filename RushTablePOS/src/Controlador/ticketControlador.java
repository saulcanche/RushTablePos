
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
    int contadorCuentas = -1;   //Apunta a la ultima cuenta de la lista
    
    public void listaCuentas(JList objetivo){
        modeloLista.removeAllElements();
        
        for(int i = 0; i < actual.getCuentasAbiertas().size(); i++){
            modeloLista.addElement(actual.getCuentasAbiertas().get(i).getId());
           // System.out.println(actual.getCuentasAbiertas().get(i).getId());
            contadorCuentas++;
        }
        
        objetivo.setModel(modeloLista);
    }
    
    public void agregarCuenta(String mesa){
        contadorCuentas++;
        Cuenta nuevacuenta = new Cuenta(mesa, contadorCuentas, LocalDate.MAX, LocalTime.MIN);
        actual.agregarCuenta(nuevacuenta);
        main.agregarCuentaAbierta(nuevacuenta);
    }
    
    public void agregarItem(String id,String nombre, String categoria, String descripcion, double precio, int index){
        ItemMenu item = new ItemMenu(id,nombre,categoria,descripcion,precio,index);
        actual.getCuentasAbiertas().get(index).agregarItemCuenta(item);
        actual.agregarItem(item);
    }
    
}
