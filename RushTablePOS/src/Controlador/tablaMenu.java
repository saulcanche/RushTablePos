
package Controlador;

import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class tablaMenu {
    
    public void inicializarMenu(JTable tabla){
        Vector<String> titulos = new Vector<String>();
        Vector<Vector<Object>> data = new Vector<Vector<Object>>();
        
        titulos.add("Nombre");
        titulos.add("Precio");
        titulos.add("Categoria");
        titulos.add("Descripcion");
        
        for(int i=0; i<main.listaItems.size(); i++){
            Vector<Object> filas = new Vector<Object>();
            
            filas.add(main.listaItems.get(i).getNombre());
            filas.add(main.listaItems.get(i).getPrecio());
            filas.add(main.listaItems.get(i).getCategoria());
            filas.add(main.listaItems.get(i).getDescripcion());

            data.add(filas);
        }
        
        DefaultTableModel modeloMenu = new DefaultTableModel(data,titulos);
        tabla.setModel(modeloMenu);
    }
    
}
