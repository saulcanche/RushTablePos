
package modelo;

import java.util.ArrayList;

/**
 *
 * @author all
 */
public class Mesero extends Empleado{
    private double pagoPorHora;
    private double ventaTotal;
    private ArrayList<Cuenta> CuentasAbiertas;
    private Comanda comanda;
    private ArrayList<ItemMenu> itemsVendidos;

    public Mesero(double pagoPorHora, double ventaTotal, ArrayList<Cuenta> CuentasAbiertas, Comanda comanda, ArrayList<ItemMenu> itemsVendidos, int id, int userCode, String nombre, String apellido, String NSS, Autoridad autoridad, double antiguedad, int diasVacaciones) {
        super(id, userCode, nombre, apellido, NSS, autoridad, antiguedad, diasVacaciones, "Mesero");
        this.pagoPorHora = pagoPorHora;
        this.ventaTotal = ventaTotal;
        this.CuentasAbiertas = CuentasAbiertas;
        this.comanda = comanda;
        this.itemsVendidos = itemsVendidos;
    }
    
    

    public void registrarPagoCuenta(Cuenta cuenta){
        cuenta.setIsPayed(true);
        ventaTotal += cuenta.getTotal();

    }
    public void tomarPedido(Comanda comanda, Cuenta cuenta){
        cuenta.setItemsConsumidos(comanda.itemsComanda);

    }
    public void imprimirCuenta(Cuenta cuenta){

    }
    public void verCuentasAbiertas(){

    }


    public double getPagoPorHora() {
        return this.pagoPorHora;
    }

    public void setPagoPorHora(double pagoPorHora) {
        this.pagoPorHora = pagoPorHora;
    }

    public double getVentaTotal() {
        return this.ventaTotal;
    }

    public void setVentaTotal(double ventaTotal) {
        this.ventaTotal = ventaTotal;
    }

    public ArrayList<Cuenta> getCuentasAbiertas() {
        return this.CuentasAbiertas;
    }

    public void setCuentasAbiertas(ArrayList<Cuenta> CuentasAbiertas) {
        this.CuentasAbiertas = CuentasAbiertas;
    }

    public Comanda getComanda() {
        return this.comanda;
    }

    public void setComanda(Comanda comanda) {
        this.comanda = comanda;
    }

    public ArrayList<ItemMenu> getItemsVendidos() {
        return this.itemsVendidos;
    }

    public void setItemsVendidos(ArrayList<ItemMenu> itemsVendidos) {
        this.itemsVendidos = itemsVendidos;
    }
}

