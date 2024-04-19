/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
    private ArrayList<itemMenu> itemsVendidos;

    public void registrarPagoCuenta(Cuenta cuenta){
        cuenta.setIsPayed(true);
        ventaTotal += cuenta.getTotal();

    }
    public void tomarPedido(Comanda comanda, Cuenta cuenta){
        cuenta.item

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

    public ArrayList<itemMenu> getItemsVendidos() {
        return this.itemsVendidos;
    }

    public void setItemsVendidos(ArrayList<itemMenu> itemsVendidos) {
        this.itemsVendidos = itemsVendidos;
    }
}

