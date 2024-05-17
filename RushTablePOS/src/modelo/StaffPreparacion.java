package modelo;

import java.util.ArrayList;

abstract class StaffPreparacion extends Empleado{
    
    private double pagoPorHora;
    public StaffPreparacion(double pagoPorHora, int id, int userCode, String nombre, String apellido, String NSS, Autoridad autoridad, double antiguedad, int diasVacaciones) {
        super(id, userCode, nombre, apellido, NSS, autoridad, antiguedad, diasVacaciones, "Preparacion");
        this.pagoPorHora = pagoPorHora;
    }
    
    abstract Comanda VerComanda(Restaurante restaurante);
    abstract void marcarComandaHecha(Restaurante restaurante);

}
