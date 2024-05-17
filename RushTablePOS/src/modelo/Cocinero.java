package modelo;
     

import java.util.ArrayList;

public class Cocinero extends StaffPreparacion{

    public Cocinero(double pagoPorHora, int id, int userCode, String nombre, String apellido, String NSS, Autoridad autoridad, double antiguedad, int diasVacaciones) {
        super(pagoPorHora, id, userCode, nombre, apellido, NSS, autoridad, antiguedad, diasVacaciones);
    }
   
    @Override
    Comanda VerComanda(Restaurante restaurante) {
        Comanda ultimaComanda = restaurante.getCocina().peek();
        return ultimaComanda; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    void marcarComandaHecha(Restaurante restaurante) {
        restaurante.getCocina().remove();

    } 
   
}
