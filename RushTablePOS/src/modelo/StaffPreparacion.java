import java.util.ArrayList;

abstract class StaffPreparacion extends Empleado{
    private double pagoPorHora;

    abstract ArrayList<Comanda> VerComanda();

    abstract void marcarComandaHecha();
}
