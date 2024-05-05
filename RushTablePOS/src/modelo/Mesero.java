
package modelo;
import java.util.*;
import java.util.ArrayList;

/**
 * @author all
 **/
public class Mesero extends Empleado{
    private double pagoPorHora;
    private double ventaTotal;
    private ArrayList<Cuenta> CuentasAbiertas;
    private Comanda comanda;
    private ArrayList<ItemMenu> itemsVendidos;

    public Mesero(double pagoPorHora, int id, int userCode, String nombre, String apellido, String NSS, Autoridad autoridad, double antiguedad, int diasVacaciones) { //constructor principal de mesero
        super(id, userCode, nombre, apellido, NSS, autoridad, antiguedad, diasVacaciones, "Mesero");
        this.pagoPorHora = pagoPorHora;
        this.ventaTotal = 0;
        this.CuentasAbiertas = new ArrayList<>();
        this.comanda = new Comanda(String.valueOf(id), this);
        this.itemsVendidos = new ArrayList<>();;
    }

    public void registrarPagoCuenta(Cuenta cuenta){
        cuenta.setIsPayed(true);
        ventaTotal += cuenta.getTotal();

    }

    public void hacerComandaNueva() {
    try {
        if (comanda.itemsComanda.isEmpty()) {
            // No hay una comanda activa, crear una nueva
            comanda = new Comanda(String.valueOf(getId()), this);
            System.out.println("Se ha creado una nueva comanda.");
        } else {
            // Ya hay una comanda activa, manejar según los requisitos de tu aplicación
            System.out.println("Ya hay una comanda activa.");
        }
    } 
    catch (Exception e) {
            System.out.println("Error al hacer una nueva comanda: " + e.getMessage());
    }
    }

    public void añadirElementoComanda(ItemMenu item) {
    try {
        if (comanda.itemsComanda.isEmpty()) {
            System.out.println("No hay una comanda activa. Crea una nueva comanda primero.");
        } else {
            comanda.agregarElemento(item);
            System.out.println("Se ha añadido el elemento a la comanda.");
        }
    } catch (Exception e) {
        System.out.println("Error al añadir un elemento a la comanda: " + e.getMessage());
    }
}
    public void mandarComanda(Restaurante restaurante) {
    try {
        // Verificar si hay una comanda activa
        if (this.comanda.itemsComanda.isEmpty()) {
            System.out.println("No hay elementos en la comanda para enviar.");
            return;
        }

        // Enviar la comanda al restaurante
        comanda.mandarComanda(restaurante, this.comanda, (Mesero)null); // Falta añadir mesero de manera correcta !!!! 
        
        // Añadir los elementos de la comanda a la cuenta 
        for(ItemMenu item : comanda.itemsComanda) { comanda.agregarElemento(item); }
        // Vaciar la comanda después de enviarla
        comanda.itemsComanda.clear();
        System.out.println("La comanda ha sido enviada al restaurante.");
    } catch (Exception e) { System.out.println("Error al enviar la comanda: " + e.getMessage()); }
}

    public void imprimirCuenta(Cuenta cuenta) {
        System.out.println("Detalles de la cuenta:");
        for (ItemMenu item : cuenta.getItemsConsumidos()) {
            System.out.println(item); // Imprimir los detalles de cada item consumido
        }
        System.out.println("Subtotal: " + cuenta.getSubtotal());
        System.out.println("IVA: " + cuenta.getIVA());
        System.out.println("Total a pagar: " + cuenta.getTotal());
    }
    
    public void verCuentasAbiertas(){

    }

    public double getPagoPorHora() { return this.pagoPorHora; }
    public void setPagoPorHora(double pagoPorHora) { this.pagoPorHora = pagoPorHora; }
    public double getVentaTotal() { return this.ventaTotal; }
    public void setVentaTotal(double ventaTotal) { this.ventaTotal = ventaTotal; }
    public ArrayList<Cuenta> getCuentasAbiertas() { return this.CuentasAbiertas; }
    public void setCuentasAbiertas(ArrayList<Cuenta> CuentasAbiertas) { this.CuentasAbiertas = CuentasAbiertas; }
    public Comanda getComanda() { return this.comanda; }
    public void setComanda(Comanda comanda) { this.comanda = comanda; }
    public ArrayList<ItemMenu> getItemsVendidos() { return this.itemsVendidos; }
    public void setItemsVendidos(ArrayList<ItemMenu> itemsVendidos) { this.itemsVendidos = itemsVendidos; }

}

