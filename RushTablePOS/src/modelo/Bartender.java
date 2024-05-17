package modelo;
import java.util.ArrayList;



public class Bartender extends StaffPreparacion {

    public Bartender(double pagoPorHora, int id, int userCode, String nombre, String apellido, String NSS, Autoridad autoridad, double antiguedad, int diasVacaciones) {
        super(pagoPorHora, id, userCode, nombre, apellido, NSS, autoridad, antiguedad, diasVacaciones);
    }
    
    

    @Override
    Comanda VerComanda(Restaurante restaurante) {
        Comanda ultimaComanda = restaurante.getBarra().peek();
        return ultimaComanda; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    void marcarComandaHecha(Restaurante restaurante) {
        restaurante.getBarra().remove();

    }
    
}
