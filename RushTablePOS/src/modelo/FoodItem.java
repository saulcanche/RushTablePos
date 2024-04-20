
package modelo;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;


/**
 * @author Octavio
 **/
public class FoodItem extends ItemMenu {
    
    public FoodItem(String id, String nombre, String categoria, String descripcion, Duration timeForPreparation, LocalTime sendTime, LocalTime timeProgramed, String status, double precio, boolean isOutStock, ArrayList<String> mensajes) {
        super(id, nombre, categoria, descripcion, timeForPreparation, sendTime, timeProgramed, status, precio, isOutStock, mensajes);
    }
    
}
