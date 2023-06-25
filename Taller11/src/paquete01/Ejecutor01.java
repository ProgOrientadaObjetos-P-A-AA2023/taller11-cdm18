/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.ArrayList;
import paquete02.*;
import paquete03.*;

/**
 *
 * @author reroes
 */
public class Ejecutor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Menu> menus = new ArrayList();

        MenuNino mN1 = new MenuNino(1, 1.5, "Niños 01", 2);
        menus.add(mN1);

        MenuNino mN2 = new MenuNino(1, 1.5, "Niños 02", 3);
        menus.add(mN2);

        MenuEconomico mE = new MenuEconomico(25, "Econo 001", 4);
        menus.add(mE);

        MenuDia mD = new MenuDia(1, 1, "Dia 001", 5);
        menus.add(mD);

        MenuCarta mC = new MenuCarta(1.5, 2, 10, "Carta 001", 6);
        menus.add(mC);

        Cuenta c1 = new Cuenta("René Elizalde", menus, 10);

        System.out.printf("Factura\n"
                + "Cliente: %s\n", c1.getNombreCliente());

        for (int i = 0; i < menus.size(); i++) {         
            menus.get(i).calcularValorMenuCancelar();
            System.out.println(menus.get(i));
        }
        c1.setSubtotal();
        c1.calcularValorCancelar();
        System.out.println(c1);
    }
}




// lo que debe presentar
/*
Factura
Cliente: René Elizalde
Menu del Día:
	Plato: Niños 01
	Valor Inicial: 2,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 4,50

Menu del Día:
	Plato: Niños 02
	Valor Inicial: 3,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 5,50

Menu Económico:
	Plato: Econo 001
	Valor Inicial: 4,00
	Porcentaje Descuento: 25,00
	Valor del Menú: 3,00

Menu del Día:
	Plato: Dia 001
	Valor Inicial: 5,00
	Valor bebida: 1,00
	Valor postre: 1,00
	Valor del Menú: 7,00

Menu a la Carta:
	Plato: Carta 001
	Valor Inicial: 6.0
	Valor guarnición: 1.5
	Valor bebida: 2.0
	Porcentaje Adicional: 10,00
	Valor del Menú: 10,10

Subtotal: 30,1
IVA: 10,0%
Total a pagar: 33,110

 */
