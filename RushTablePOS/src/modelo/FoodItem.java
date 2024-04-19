package modelo;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;

public class FoodItem extends ItemMenu {
    private String alergia;
    private boolean isSomeoneAlergic;

    // Constructor

    public foodItem(String alergia, boolean isSomeoneAlergic, String id, String nombre, String categoria, String descripcion, Duration timeForPreparation, LocalTime sendTime, LocalTime timeProgramed, String status, double precio, boolean isOutStock, ArrayList<String> mensajes) {
        super(id, nombre, categoria, descripcion, timeForPreparation, sendTime, timeProgramed, status, precio, isOutStock, mensajes);
        this.alergia = alergia;
        this.isSomeoneAlergic = isSomeoneAlergic;
    }
    
}
