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
public class MenuCarta extends Menu {

    protected double porcionGuarnicion;
    protected double valorBebida;
    protected double porcentajeAdicional;

    public MenuCarta(double pG, double vB, double pA, String nP, double vI) {
        super(nP,vI);
        porcionGuarnicion = pG;
        valorBebida = vB;
        porcentajeAdicional = pA;
    }

    public void setPorcionGuarnicion(double pG) {
        porcionGuarnicion = pG;
    }

    public void setValorBebida(double vB) {
        valorBebida = vB;
    }

    public void setPorcentajeAdicional(double pA) {
        porcentajeAdicional = pA;
    }
    
    @Override
    public void calcularValorMenuCancelar(){
       valorMenuCancelar  = (valorInicial + porcionGuarnicion + 
               valorBebida) + valorInicial * (porcentajeAdicional*0.01) ;
    }
    
    
    public double getPorcionGuarnicion() {
        return porcionGuarnicion;
    }

    public double getValorBebida() {
        return valorBebida;
    }

    public double getPorcentajeAdicional() {
        return porcentajeAdicional;
    }

   @Override
    public String toString() {
        String mensaje = "";
        mensaje = String.format("%sMenu a la carta:\n"
                + "\tPlato: %s\n"
                + "\tValor inicial:  %.2f USD\n"
                + "\tValor guarnicion: %.2f USD\n"
                + "\tValor bebida: %.2f USD\n"
                + "\tPorcentaje Adicional: %.2f\n"
                + "\tValor del Menú: %.2f\n",
                mensaje,
                nombrePlato,
                valorInicial,
                porcionGuarnicion,
                valorBebida,
                porcentajeAdicional,
                valorMenuCancelar);      
        return mensaje;
    }
    
    

}
