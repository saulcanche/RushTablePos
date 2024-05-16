package Controlador;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.ItemMenu;
import modelo.Mesero;

public class gerenteControlador {
    Vector<String> titulos = new Vector<String>();
    Vector<Vector<Object>> data = new Vector<Vector<Object>>();
    ArrayList<Mesero> lista = main.restaurante.getMeseros();
    ArrayList<ItemMenu> listaMenu = new ArrayList<ItemMenu>();
    
    public void inicializar(JTable tabla){
        for(int i = 0; i <lista.size(); i++){
            listaMenu.addAll(lista.get(i).getItemsVendidos());
        }
        
        titulos.add("Nombre");
        titulos.add("Categoria");
        titulos.add("Costo");

        for(int i=0; i<listaMenu.size(); i++){
            if(listaMenu.get(i).getStatus()==3){
                Vector<Object> filas = new Vector<Object>();
                filas.add(listaMenu.get(i).getNombre());
                filas.add(listaMenu.get(i).getCategoria());
                filas.add(listaMenu.get(i).getPrecio());                
                data.add(filas);
            }
        }

        DefaultTableModel modelo = new DefaultTableModel(data,titulos);
        tabla.setModel(modelo);
        }

    public void initCB(JCheckBox carne, JCheckBox hamburguesa, JCheckBox pasta, JCheckBox pizza){
        for(int i = 0; i<main.listaItems.size(); i++){
            if(main.listaItems.get(i).getNombre()=="Carne"){
                carne.setSelected(true);
            }
            if(main.listaItems.get(i).getNombre()=="Hamburguesa"){
                hamburguesa.setSelected(true);
            }
            if(main.listaItems.get(i).getNombre()=="Pasta"){
                pasta.setSelected(true);
            }
            if(main.listaItems.get(i).getNombre()=="Pizza"){
                pizza.setSelected(true);
            }
        }
    }
}
