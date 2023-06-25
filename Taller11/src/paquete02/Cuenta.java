/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import java.util.ArrayList;

/**
 *
 * @author carlo
 */
public class Cuenta {

    protected String nombreCliente;
    protected ArrayList<Menu> listadoCartas;
    protected double valorCancelar;
    protected double subtotal = 0;
    protected double iva;

    public Cuenta(String nC, ArrayList<Menu> lC, double i) {
        nombreCliente = nC;
        listadoCartas = lC;
        iva = i;
    }

    
    
    public void setNombreCliente(String nC) {
        nombreCliente = nC;
    }

    public void setListadoCartas(ArrayList<Menu> lC) {
        listadoCartas = lC;
    }

    public void setSubtotal() {
        for (int i = 0; i < listadoCartas.size(); i++) {
            subtotal = subtotal + listadoCartas.get(i).valorMenuCancelar;
        }
    }

    public void setIva(double i) {
        iva = i;
    }
    
     public void calcularValorCancelar() {
        valorCancelar = subtotal + (subtotal * (iva* 0.01));
    }
    
    public String getNombreCliente() {
        return nombreCliente;
    }

    public ArrayList<Menu> getListadoCartas() {
        return listadoCartas;
    }

    public double getValorCancelar() {
        return valorCancelar;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getIva() {
        return iva;
    }

    @Override
    public String toString() {
        String mensaje = String.format ("Subtotal: %.1f USD\n"
                + "IVA: %.1f por ciento\n"
                + "Total a pagar:  %.3f USD\n",
                subtotal,
                iva,
                valorCancelar);
        return mensaje;
    }
    /*


     */
}
