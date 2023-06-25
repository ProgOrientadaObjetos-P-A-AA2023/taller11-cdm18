/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

import paquete02.Menu;

/**
 *
 * @author carlo
 */
public class MenuEconomico extends Menu {

    protected double descuento;

    public MenuEconomico(double d, String nP, double vI) {
        super(nP,  vI);
        descuento = d;
    }

    public void setDescuento(double d ) {
        descuento = d;
    }

    @Override
    public void calcularValorMenuCancelar() {
        valorMenuCancelar = valorInicial - (valorInicial * (descuento*0.01));
    }

    public double getDescuento() {
        return descuento;
    }

    @Override
    public String toString() {
        String mensaje = String.format("Menu Economico:\n"
                + "\tPlato: %s\n"
                + "\tValor inicial:  %.2f USD\n"             
                + "\tPorcentaje Descuento: %.2f\n"
                + "\tValor del Menú: %.2f USD\n",
                nombrePlato,
                valorInicial,
                descuento,
                valorMenuCancelar);
        return mensaje;
    }

}
