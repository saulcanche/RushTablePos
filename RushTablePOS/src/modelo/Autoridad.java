/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package modelo;

/**
 *
 * @author Saul
 */

public class Autoridad {

    private enum autoridad {
        LOW,
        MID,
        HIGH
    }

    autoridad aut;

    public Autoridad(int n) { setAut(n); }

    public void setAut(int n) {
        if (n > 2) n = n % 2; // Caso en el que n > 2
        if (n == 0) this.aut = autoridad.HIGH;
        if (n == 1) this.aut = autoridad.MID;
        if (n == 2) this.aut = autoridad.LOW;
    }

    public String toString() {
        if (this.aut == autoridad.HIGH) return "HIGH";
        else if (this.aut == autoridad.MID) return "MID";
        else if (this.aut == autoridad.LOW) return "LOW";
        return null;
    }
}
