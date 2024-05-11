package modelo;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * @author Saul
 **/

 public class Gerente extends Empleado {
    double metaDeVenta;
    double bonoPorMeta;
    Restaurante restaurante;

    public Gerente(double metaDeVenta, double bonoPorMeta, Restaurante restaurante, int id, int userCode, String nombre, String apellido, String NSS, Autoridad autoridad, double antiguedad, int diasVacaciones) {
        super(id, userCode, nombre, apellido, NSS, autoridad, antiguedad, diasVacaciones, "Gerente");
        setMetaDeVenta(metaDeVenta);
        setBonoPorMeta(bonoPorMeta);
        setRestaurante(restaurante);
    }

    public double getMetaDeVenta() { return this.metaDeVenta; }

    public void setMetaDeVenta(double metaDeVenta) throws NullPointerException {
        try {
            if (metaDeVenta > 0) this.metaDeVenta = metaDeVenta;  
            metaDeVenta = 100;  /* Necesitamos definir un estándar para este tipo de cosas */
        }
        catch(NullPointerException e) { 
            this.metaDeVenta = 100; 
            System.out.println(e.getMessage());
        }
    }

    public double getBonoPorMeta() { return this.bonoPorMeta; }

    public void setBonoPorMeta(double bonoPorMeta) {
        try { if (bonoPorMeta >= 0) this.bonoPorMeta = bonoPorMeta; }
        catch(NullPointerException e) { 
            this.bonoPorMeta = 0.01; 
            System.out.println(e.getMessage());
        }
    }

    public Restaurante getRestaurante() { return this.restaurante; }

    public void setRestaurante(Restaurante restaurante) throws NullPointerException, NoClassDefFoundError {
        try { this.restaurante = restaurante; }
        catch(NullPointerException | NoClassDefFoundError e) { 
            System.out.println(e.getMessage());
            throw e; 
        }
    }    

    public void ModificarMenu() {
        /* Como trabajamos con el menu ??? Creamos una clase para menu ??? */
    } 

    public void AccederVentas() {
        Restaurante r = this.restaurante; 
        r.GenerarInformeDeVentas();
        /* Mostrar tabla de informe de ventas en GUI */
    }

    public void GestionarHorarios() {
        /* 
         * Como vamos manejar los horarios?
         * Tenemos que crear una tabla para la vista de gerente?
         * Usaremos las clases para manejar tiempo en Java???
         */
    }

    public void GestionarInventario() {
        /* 
         * 
         */
    }
}