package Controlador;

import java.util.ArrayList;
import modelo.ItemMenu;
import Vista.mainForm;

public class main {

     public static ArrayList<ItemMenu> listaItems = new ArrayList<ItemMenu>();

    public static void main(String [] args){
        new mainForm().setVisible(true);
    }
}
