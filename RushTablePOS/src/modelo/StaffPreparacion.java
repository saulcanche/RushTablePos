package modelo;

import java.util.ArrayList;

abstract class StaffPreparacion extends Empleado{
    private double pagoPorHora;

    public StaffPreparacion(double pagoPorHora, int id, int userCode, String nombre, String apellido, String NSS, Autoridad autoridad, double antiguedad, int diasVacaciones) {
        super(id, userCode, nombre, apellido, NSS, autoridad, antiguedad, diasVacaciones);
        this.pagoPorHora = pagoPorHora;
    }
    
    

    abstract ArrayList<Comanda> VerComanda();

    abstract void marcarComandaHecha();
}
