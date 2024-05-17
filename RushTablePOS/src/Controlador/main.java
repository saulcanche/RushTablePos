package Controlador;

import Vista.loginForm;
import java.util.ArrayList;
import modelo.ItemMenu;
import Vista.mainForm;
import Vista.meseroForm;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import modelo.Autoridad;
import modelo.Cuenta;
import modelo.Empleado;
import modelo.Mesero;
import modelo.Restaurante;

public class main {

     public static ArrayList<ItemMenu> listaItems = new ArrayList<ItemMenu>();
     public static Restaurante restaurante = new Restaurante();
    public static int idActual;
     

    public static void main(String [] args){
        
        // añade una cuenta default
        restaurante.AgregarEmpleado("Test", "Gerente", "1212", "Gerente",1);
        restaurante.AgregarEmpleado("Test", "Dos", "222", "Mesero",2);
        restaurante.AgregarEmpleado("Test", "Tres", "333", "Cocinero",3);
        restaurante.AgregarEmpleado("Test", "Cuatro", "444", "Bartender",4);
        
        
        new loginForm().setVisible(true);
    }
    
    public static void agregarCuentaAbierta(Cuenta cuenta){
        restaurante.agregarCuenta(cuenta);
    }
}