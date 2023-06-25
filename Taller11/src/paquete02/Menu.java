/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author carlo
 */
public abstract class Menu {

    protected String nombrePlato;
    protected double valorMenuCancelar;
    protected double valorInicial;
    protected String nombreMenu;

    public Menu(String nP, double vI) {
        nombrePlato = nP;
       
        valorInicial = vI;
    }

    public void setNombrePlato(String nP) {
        nombrePlato = nP;
    }
    
    public void setNombreMenu(String nM) {
        nombreMenu = nM;
    }
    

    public void setValorInicial(double vI) {
        valorInicial = vI;
    }

    public abstract void calcularValorMenuCancelar();

    public String getNombrePlato() {
        return nombrePlato;
    }

    public double getValorMenuCancelar() {
        return valorMenuCancelar;
    }

    public double getValorInicial() {
        return valorInicial;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Menu{");
        sb.append("nombrePlato=").append(nombrePlato);
        sb.append(", valorMenuCancelar=").append(valorMenuCancelar);
        sb.append(", valorInicial=").append(valorInicial);
        sb.append(", nombreMenu=").append(nombreMenu);
        sb.append('}');
        return sb.toString();
    }
    
    

}
