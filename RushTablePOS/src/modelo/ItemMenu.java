package modelo;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;

public class ItemMenu {
    private String id;
    private String nombre;
    private String categoria;
    private String descripcion;
    private Duration timeForPreparation;
    private LocalTime sendTime;
    private LocalTime timeProgramed;
    private String status;
    private double precio;
    private boolean isOutStock;
    private ArrayList<String> mensajes;

    // Constructor

    public ItemMenu(String id, String nombre, String categoria, String descripcion, Duration timeForPreparation, LocalTime sendTime, LocalTime timeProgramed, String status, double precio, boolean isOutStock, ArrayList<String> mensajes) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.timeForPreparation = timeForPreparation;
        this.sendTime = sendTime;
        this.timeProgramed = timeProgramed;
        this.status = status;
        this.precio = precio;
        this.isOutStock = isOutStock;
        this.mensajes = mensajes;
    }
    

    // Method to add message
    public void agregarMensaje(String mensaje) {
        mensajes.add(mensaje);
    }

    
    // Getters y setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String category) {
        this.categoria = category;
    }

    public Duration getTimeForPreparation() {
        return timeForPreparation;
    }

    public void setTimeForPreparation(Duration timeForPreparation) {
        this.timeForPreparation = timeForPreparation;
    }

    public LocalTime getSendTime() {
        return sendTime;
    }

    public void setSendTime(LocalTime sendTime) {
        this.sendTime = sendTime;
    }

    public LocalTime getTimeProgramed() {
        return timeProgramed;
    }

    public void setTimeProgramed(LocalTime timeProgramed) {
        this.timeProgramed = timeProgramed;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isIsOutStock() {
        return isOutStock;
    }

    public void setIsOutStock(boolean isOutStock) {
        this.isOutStock = isOutStock;
    }

    public ArrayList<String> getMensajes() {
        return mensajes;
    }

    public void setMensajes(ArrayList<String> mensajes) {
        this.mensajes = mensajes;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}