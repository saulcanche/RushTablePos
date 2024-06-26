package modelo;

import java.io.Serializable;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class Empleado implements Nomina, Serializable{
    private int id;
    private int userCode;
    private String nombre;
    private String apellido;
    private String NSS;
    private Autoridad autoridad;
    double antiguedad;
    int diasVacaciones;
    double pagoQuincenal;
    private String rol;
    private LocalDate horarioEntrada;
    private LocalTime horaInicioJornada;
    private LocalTime horaFinJornada;
    private Duration tiempoTrabajoDia;
    private Duration tiempoTrabajoQuincena;

    public Empleado(int id, int userCode, String nombre, String apellido, String NSS, Autoridad autoridad, double antiguedad, int diasVacaciones, String rol) {
        this.id = id;
        this.userCode = userCode;
        this.nombre = nombre;
        this.apellido = apellido;
        this.NSS = NSS;
        this.autoridad = autoridad;
        this.antiguedad = antiguedad;
        this.diasVacaciones = diasVacaciones;
        this.rol = rol;
    }

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

    public int getUserCode() {
        return userCode;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNSS() {
        return NSS;
    }

    public Autoridad getAutoridad() {
        return autoridad;
    }

    public double getAntiguedad() {
        return antiguedad;
    }

    public int getDiasVacaciones() {
        return diasVacaciones;
    }

    public double getPagoQuincenal() {
        return pagoQuincenal;
    }

    public String getRol() {
        return rol;
    }

    public LocalDate getHorarioEntrada() {
        return horarioEntrada;
    }

    public LocalTime getHoraInicioJornada() {
        return horaInicioJornada;
    }

    public LocalTime getHoraFinJornada() {
        return horaFinJornada;
    }

    public Duration getTiempoTrabajoDia() {
        return tiempoTrabajoDia;
    }

    public Duration getTiempoTrabajoQuincena() {
        return tiempoTrabajoQuincena;
    }

    public void setUserCode(int userCode) {
        this.userCode = userCode;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNSS(String NSS) {
        this.NSS = NSS;
    }

    public void setAutoridad(Autoridad autoridad) {
        this.autoridad = autoridad;
    }

    public void setAntiguedad(double antiguedad) {
        this.antiguedad = antiguedad;
    }

    public void setDiasVacaciones(int diasVacaciones) {
        this.diasVacaciones = diasVacaciones;
    }

    public void setPagoQuincenal(double pagoQuincenal) {
        this.pagoQuincenal = pagoQuincenal;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public void setHorarioEntrada(LocalDate horarioEntrada) {
        this.horarioEntrada = horarioEntrada;
    }

    public void setHoraInicioJornada(LocalTime horaInicioJornada) {
        this.horaInicioJornada = horaInicioJornada;
    }

    public void setHoraFinJornada(LocalTime horaFinJornada) {
        this.horaFinJornada = horaFinJornada;
    }

    public void setTiempoTrabajoDia(Duration tiempoTrabajoDia) {
        this.tiempoTrabajoDia = tiempoTrabajoDia;
    }

    public void setTiempoTrabajoQuincena(Duration tiempoTrabajoQuincena) {
        this.tiempoTrabajoQuincena = tiempoTrabajoQuincena;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Empleado { " + " id = " + id + ", userCode = " + userCode + ", nombre = " + nombre + ", apellido = " + apellido + ", NSS = " + NSS + ", autoridad = " + autoridad + ", antiguedad = " + antiguedad + ", diasVacaciones = " + diasVacaciones + ", pagoQuincenal = " + pagoQuincenal + ", rol = " + rol + ", horarioEntrada = " + horarioEntrada + ", horaInicioJornada = " + horaInicioJornada + ", horaFinJornada = " + horaFinJornada + ", tiempoTrabajoDia = " + tiempoTrabajoDia + ", tiempoTrabajoQuincena = " + tiempoTrabajoQuincena + " } ";
    }

    @Override
    public void calcularPagoQuincena() {
        setPagoQuincenal(pagoQuincenal);
    }
}