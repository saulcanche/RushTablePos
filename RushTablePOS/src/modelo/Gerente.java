
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
        this.metaDeVenta = metaDeVenta;
        this.bonoPorMeta = bonoPorMeta;
        this.restaurante = restaurante;
    }

    public double getMetaDeVenta() {
        return this.metaDeVenta;
    }

    public void setMetaDeVenta(double metaDeVenta) {
        this.metaDeVenta = metaDeVenta;
    }

    public double getBonoPorMeta() {
        return this.bonoPorMeta;
    }

    public void setBonoPorMeta(double bonoPorMeta) {
        this.bonoPorMeta = bonoPorMeta;
    }

    public Restaurante getRestaurante() {
        return this.restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }    
}
