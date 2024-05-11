package Controlador;

import Vista.loginForm;
import java.util.ArrayList;
import modelo.ItemMenu;
import Vista.mainForm;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import modelo.Restaurante;

public class main {

     public static ArrayList<ItemMenu> listaItems = new ArrayList<ItemMenu>();
     public static Restaurante restaurante = new Restaurante();

    public static void main(String [] args){
        
        // añade una cuenta default
        restaurante.AgregarEmpleado("Test", "Uno", "111", "Supervisor");
        restaurante.AgregarEmpleado("Test", "Gerente", "1212", "Gerente");
        restaurante.AgregarEmpleado("Test", "Dos", "222", "Mesero");
        restaurante.AgregarEmpleado("Test", "Tres", "333", "Cocinero");
        restaurante.AgregarEmpleado("Test", "Cuatro", "444", "Bartender");
        
        
        //new mainForm().setVisible(true);
        new loginForm().setVisible(true);
    }
    
    // ENTREGA DE PROYECTO AQUI
}