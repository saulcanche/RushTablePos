
package modelo;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author Octavio
 */
public class Pizza extends ItemMenu{
    private String tamano;
    private Boolean esDelgada;
    private boolean esCrujiente;

    public Pizza(String tamano, Boolean esDelgada, boolean esCrujiente, String id, String nombre, String categoria, String descripcion, double precio, int mesa) {
        super(id, nombre, categoria, descripcion, precio, mesa);
        this.tamano = tamano;
        this.esDelgada = esDelgada;
        this.esCrujiente = esCrujiente;
    }

    

    

    
    
    
}
