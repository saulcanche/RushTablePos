
package Controlador;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.ItemMenu;
import modelo.Mesero;
import modelo.Restaurante;


public class prodControlador {
    DefaultTableModel modeloAlimentos = new DefaultTableModel();
    DefaultTableModel modeloBebidas = new DefaultTableModel();
    
    ArrayList<Mesero> lista = main.restaurante.getMeseros();
    ArrayList<ItemMenu> listaMenu = new ArrayList<ItemMenu>();
    
    
    public void iniicalizar(JTable alimentos, JTable bebidas){
        
        for(int i = 0; i <lista.size(); i++){
            listaMenu.addAll(lista.get(i).getItemsVendidos());
        }
        
        Vector<String> titulos = new Vector<String>();
        Vector<Vector<Object>> dataAlimentos = new Vector<Vector<Object>>();
        Vector<Vector<Object>> dataBebidas = new Vector<Vector<Object>>();

        
        titulos.add("Nombre");
        titulos.add("Descripcion");
        titulos.add("Mesa");
        for(int i=0; i<listaMenu.size(); i++){
            if(listaMenu.get(i).getStatus()==0 ){
                
                if (listaMenu.get(i).getCategoria()=="Alimento") {
                    Vector<Object> filas = new Vector<Object>();
                    filas.add(listaMenu.get(i).getNombre());
                    filas.add(listaMenu.get(i).getDescripcion());
                    filas.add(listaMenu.get(i).getId());
                    dataAlimentos.add(filas);
                } else{
                    Vector<Object> filas = new Vector<Object>();
                    filas.add(listaMenu.get(i).getNombre());
                    filas.add(listaMenu.get(i).getDescripcion());
                    filas.add(listaMenu.get(i).getId());
                    dataBebidas.add(filas);
                }
            }   
        }
        modeloAlimentos.setRowCount(0);
        modeloAlimentos = new DefaultTableModel(dataAlimentos,titulos);
        alimentos.setModel(modeloAlimentos);
        modeloBebidas.setRowCount(0);
        modeloBebidas = new DefaultTableModel(dataBebidas,titulos);
        bebidas.setModel(modeloBebidas);
    }
    
    public ItemMenu getItem(JTable tabla,int columna){
        String mesa = tabla.getModel().getValueAt(columna, 2).toString();
        return main.restaurante.getItemMenu(mesa);
    }
    
}
