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
public class Ejecutor02 {

    public static void main(String[] args) {

        String[][] datos001 = {{"Niños 01", "2.00", "1", "1.5"},
        {"Niños 02", "3.00", "1", "1.5"},
        {"Niños 03", "2.00", "2", "0.5"},};

        String[][] datos002 = {{"Econo 001", "4", "25"},
        {"Econo 002", "4", "15"},
        {"Econo 003", "4", "35"}
        };

        String[][] datos003 = {{"Dia 001", "5", "1", "1"},
        {"Dia 002", "6", "2", "2"},
        {"Dia 003", "5.5", "3", "1"},};

        String[][] datos004 = {{"Carta 001", "6", "1.5", "2", "10"},
        {"Carta 002", "7", "1.7", "2.1", "5"},
        {"Carta 003", "8", "1.9", "2.2", "5"},
        {"Carta 004", "9", "2.5", "2.9", "5"},};

        // Lista de Menus
        ArrayList<Menu> lista = new ArrayList<>();

        /* Agregar un proceso para generar objetos de tipo Menu Carta, Día, 
        Economico y Niño*. Cada arreglo datos, se corresponde a un tipo de Menú.
        Iterar y crear los objetos según corresponda. Cada objeto generado, 
        agregar al ArrayList lista*/
        // Inicio de solución
        MenuNinos m1 = null;

        for (int i = 0; i < datos001.length; i++) {
            for (int j = 0; j < datos001[i].length; j++) {
                m1 = new MenuNinos(Double.parseDouble(datos001[i][2]),
                        Double.parseDouble(datos001[i][3]),
                        datos001[i][0],
                        Double.parseDouble(datos001[i][1]));

            }
            lista.add(m1);
        }

        MenuEconomico m2 = null;

        for (int i = 0; i < datos002.length; i++) {
            for (int j = 0; j < datos002[i].length; j++) {
                m2 = new MenuEconomico(Double.parseDouble(datos002[i][2]),
                        datos002[i][0],
                        Double.parseDouble(datos002[i][1]));

            }
            lista.add(m2);
        }

        MenuDia m3 = null;

        for (int i = 0; i < datos003.length; i++) {
            for (int j = 0; j < datos003[i].length; j++) {
                m3 = new MenuDia(Double.parseDouble(datos003[i][2]),
                        Double.parseDouble(datos003[i][3]),
                        datos003[i][0],
                        Double.parseDouble(datos003[i][1]));
            }
            lista.add(m3);
        }

        MenuCarta m4 = null;

        for (int i = 0; i < datos004.length; i++) {
            for (int j = 0; j < datos004[i].length; j++) {
                m4 = new MenuCarta(Double.parseDouble(datos004[i][2]),
                        Double.parseDouble(datos004[i][3]),
                        Double.parseDouble(datos004[i][4]),
                        datos004[i][0],
                        Double.parseDouble(datos004[i][1]));

            }
            lista.add(m4);
        }
        // Fin de solución
        // Un objeto de tipo Cuenta
        Cuenta miCuenta = new Cuenta("Luis Andrade", lista, 10);

        System.out.printf("Factura:\n"
                + "Cliente: %s\n", miCuenta.getNombreCliente());

        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).calcularValorMenuCancelar();
            System.out.println(lista.get(i));
        }

        miCuenta.setSubtotal();
        miCuenta.calcularValorCancelar();

        System.out.println(miCuenta);

    }
}
