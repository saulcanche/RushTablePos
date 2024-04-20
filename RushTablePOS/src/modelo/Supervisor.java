package modelo;

public class Supervisor extends Empleado{
   private Restaurante Restaurante; 

    public Supervisor(int id, int userCode, String nombre, String apellido, String NSS, Autoridad autoridad, double antiguedad, int diasVacaciones) {
        super(id, userCode, nombre, apellido, NSS, autoridad, antiguedad, diasVacaciones, "Supervisor");
    }
   
    public void verTodasLasCuentasAbiertas(){}

    public void verTodasLasCuentasCerradas(){}

    public void accederCuentaAbierta(){}

    public void accederCuentaCerrada(){}

    public void aplicarDescuentoCuenta(Cuenta cuenta){}

    public void quitarElementoCuenta(Cuenta cuenta){
    }

    public void accederCuentaMesero(Mesero mesero){}
}
