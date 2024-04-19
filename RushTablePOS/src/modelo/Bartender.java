package modelo;
import java.util.ArrayList;



public class Bartender extends StaffPreparacion {

    public Bartender(double pagoPorHora, int id, int userCode, String nombre, String apellido, String NSS, Autoridad autoridad, double antiguedad, int diasVacaciones) {
        super(pagoPorHora, id, userCode, nombre, apellido, NSS, autoridad, antiguedad, diasVacaciones);
    }
    
    

    @Override
    ArrayList<Comanda> VerComanda() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    void marcarComandaHecha() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
