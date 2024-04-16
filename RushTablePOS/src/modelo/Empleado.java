/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
package modelo;

/**
 *
 * @author Saul
 */
public class Empleado {
    int id;
    int userCode;
    String nombre;
    String apellido;
    String NSS;
    Autoridad autoridad;
    double antiguedad;
    int diasVacaciones;
    double pagoQuincenal;
    String rol;
    private LocalDate horarioEntrada;
    private LocalTime horaInicioJornada;
    private LocalTime horaFinJornada;
    private Duration tiempoTrabajoDia;
    private Duration tiempoTrabajoQuincena;
    
    public void iniciarJornada() {
        // Verificar si ya se inició la jornada hoy
        if (horaInicioJornada != null && horaFinJornada != null) {
            LocalTime horaActual = LocalTime.now();
            if (horaActual.isBefore(horaInicioJornada) || horaActual.isAfter(horaFinJornada)) {
                System.out.println("La jornada no puede iniciarse en este momento.");
                return;
            }
        }
        System.out.println("Jornada iniciada.");
        // Actualizar tiempo de inicio de jornada
        horaInicioJornada = LocalTime.now();
    }

    public void terminarJornada() {
        // Verificar si la jornada ya se inició hoy
        if (horaInicioJornada == null) {
            System.out.println("No se puede terminar la jornada, primero inicie la jornada.");
            return;
        }
        // Actualizar tiempo de fin de jornada
        horaFinJornada = LocalTime.now();
        // Calcular la duración de la jornada
        Duration duracionJornada = Duration.between(horaInicioJornada, horaFinJornada);
        // Sumar la duración de la jornada al tiempo total de trabajo del día
        tiempoTrabajoDia = tiempoTrabajoDia.plus(duracionJornada);
        // Sumar la duración de la jornada al tiempo total de trabajo de la quincena
        tiempoTrabajoQuincena = tiempoTrabajoQuincena.plus(duracionJornada);
        System.out.println("Jornada terminada.");
    }
}