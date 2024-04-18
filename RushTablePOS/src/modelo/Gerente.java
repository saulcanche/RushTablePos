package modelo;

import java.time.*;

/**
 *
 * Implementa la clase de Gerente usando la clase Restaurante y Autoridad
 * Clase gerente hereda de la clase de empleado
 *
 * @author angel
 */

public class Gerente extends Empleado{

    Restaurante r;
    double metaDeVenta;
    double bonoPorVenta;

    // Constructor de Gerente :
    public Gerente(int id, int userCode, String nombre, String apellido, String NSS, Autoridad autoridad, double antiguedad, int diasVacaciones, double pagoQuincenal, String rol, LocalDate horarioEntrada, LocalTime horaInicioJornada, LocalTime horaFinJornada, Duration tiempoTrabajoDia, Duration tiempoTrabajoQuincena, Restaurante r, double metaDeVenta, double bonoPorVenta) {
        super(id, userCode, nombre, apellido, NSS, autoridad, antiguedad, diasVacaciones, pagoQuincenal, rol, horarioEntrada, horaInicioJornada, horaFinJornada, tiempoTrabajoDia, tiempoTrabajoQuincena);
        setR(r);
        setBonoPorVenta(bonoPorVenta);
        setMetaDeVenta(metaDeVenta);
    }

    // Falta crear una clase Restaurante !!!!
    private void setR(Restaurante r) { this.r = r; }

    // Falta poner errores y excepciones :
    private void setMetaDeVenta(double mt) { this.metaDeVenta = mt; }
    private void setBonoPorVenta(double bv) { this.bonoPorVenta = bv; }

    public void AccederInformeVentas() {
        // Implementar el acceso al informe de ventas
    }

    public void ModificarMenu() {
        // Implementar la modificación del menu
    }

    public void GestionarInventario() {
        // Implementar la gestion del inventario
    }

    public void ElaborarHorario() {
        // Implementar la elaboracion del horario
    }

}
