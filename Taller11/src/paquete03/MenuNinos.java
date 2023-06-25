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
public class MenuNinos extends Menu{
    protected double valorHelado;
    protected double valorPastel;

    public MenuNinos(double vH, double vP, String nP, double vI) {
        super(nP, vI);
        valorHelado = vH;
        valorPastel = vP;
    }

    public void setValorHelado(double vH) {
        valorHelado = vH;
    }

    public void setValorPastel(double vP) {
        valorPastel = vP;
    }

    public double getValorHelado() {
        return valorHelado;
    }
    
    @Override
    public void calcularValorMenuCancelar() {
        valorMenuCancelar = valorInicial + valorHelado + valorPastel;
    }
    

    public double getValorPastel() {
        return valorPastel;
    }
    
    @Override
    public String toString() {
        String mensaje = String.format("Menu de Niños:\n"
                + "\tPlato: %s\n"
                + "\tValor inicial:  %.2f USD\n"             
                + "\tValor helado: %.2f USD\n"
                + "\tValor pastel: %.2f USD\n"
                + "\tValor del menu: %.2f USD",
                nombrePlato,
                valorInicial,
                valorHelado,
                valorPastel,
                valorMenuCancelar);
        return mensaje;
    }
    
    
    
    
    
}
