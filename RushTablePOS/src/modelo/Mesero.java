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

}

