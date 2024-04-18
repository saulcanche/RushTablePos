
package modelo;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Saul
 */
public class Gerente extends Empleado {
    double metaDeVenta;
    double bonoPorMeta;
    Restaurante restaurante;

    public Gerente(double metaDeVenta, double bonoPorMeta, Restaurante restaurante, int id, int userCode, String nombre, String apellido, String NSS, Autoridad autoridad, double antiguedad, int diasVacaciones, double pagoQuincenal, String rol, LocalDate horarioEntrada, LocalTime horaInicioJornada, LocalTime horaFinJornada, Duration tiempoTrabajoDia, Duration tiempoTrabajoQuincena) {
        super(id, userCode, nombre, apellido, NSS, autoridad, antiguedad, diasVacaciones, pagoQuincenal, rol, horarioEntrada, horaInicioJornada, horaFinJornada, tiempoTrabajoDia, tiempoTrabajoQuincena);
        this.metaDeVenta = metaDeVenta;
        this.bonoPorMeta = bonoPorMeta;
        this.restaurante = restaurante;
    }
    
    
}
