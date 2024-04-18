package modelo;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;

public class ItemMenu {
    private String id;
    private String name;
    private String category;
    private Duration timeForPreparation;
    private LocalTime sendTime;
    private LocalTime timeProgramed;
    private String status;
    private double precio;
    private boolean isOutStock;
    private ArrayList<String> mensajes;

    // Constructor
    public ItemMenu(String id, String name, String category, Duration timeForPreparation, double precio) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.timeForPreparation = timeForPreparation;
        this.precio = precio;
        this.mensajes = new ArrayList<>();
    }

    // Method to add message
    public void agregarMensaje(String mensaje) {
        mensajes.add(mensaje);
    }
}