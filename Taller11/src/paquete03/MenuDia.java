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
public class MenuDia extends Menu{
    protected double valorPostre;
    protected double valorBebida;

    public MenuDia(double vP, double vB, String nP, double vI) {
        super(nP,vI);
        valorPostre = vP;
        valorBebida = vB;
    }

    public void setValorPostre(double vP) {
        valorPostre = vP;
    }

    public void setValorBebida(double vB) {
        valorBebida = vB;
    }
    
    @Override
    public void calcularValorMenuCancelar(){
       valorMenuCancelar  = valorInicial + valorBebida + valorPostre;
    }
    

    public double getValorPostre() {
        return valorPostre;
    }

    public double getValorBebida() {
        return valorBebida;
    }
    
     @Override
    public String toString() {
        String mensaje = String.format("Menu del Dia:\n"
                + "\tPlato: %s\n"
                + "\tValor inicial:  %.2f USD\n"
                + "\tValor bebida: %.2f USD\n"
                + "\tValor postre: %.2f\n"
                + "\tValor del Menú: %.2f\n",
                nombrePlato,
                valorInicial,
                valorBebida,
                valorPostre,
                valorMenuCancelar
                );      
        return mensaje;
    }
    
    
    
}
