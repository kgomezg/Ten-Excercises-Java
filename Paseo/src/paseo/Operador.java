/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paseo;

import java.util.Scanner;

/**
 *
 * @author kgomezg81832
 * @date 2020.03.07
 * @desc Clase Operador
 */
public class Operador {

    // Variable de entrada
    private static final int SILLASBUS = 60, PUESTOSGORDOS = 2, PUESTOSFLACOS = 1, VALORCOMIDA = 10000, COMIDASGORDOS = 5, COMIDASFLACOS = 3, HABITACIONESTUDIANTES = 4, PRECIOHABITACION = 25000;
    private int _cantidadGordos = 0, _cantidadFlacos = 0, _diasPaseo = 0;
    private Scanner _entrada = new Scanner(System.in);

    public void _start() {
        imprimir("Escriba la cantidad de dias que durara el paseo.");
        _diasPaseo = _entrada.nextInt();

        imprimir("Escriba la cantidad de estudiantes gordos.");
        _cantidadGordos = _entrada.nextInt();

        imprimir("Escriba la cantidad de estudiantes flacos.");
        _cantidadFlacos = _entrada.nextInt();

        imprimir("Se procesara la información");

        _procesar();
    }

    private void _procesar() {
        imprimir("");

        int sillasGordos = (PUESTOSGORDOS * _cantidadGordos), sillasFlacos = (PUESTOSFLACOS * _cantidadFlacos), cantidadSillas = (sillasFlacos + sillasGordos), cantidadBuses;
        if (SILLASBUS >= cantidadSillas) {
            cantidadBuses = 1;
        } else {
            cantidadBuses = Math.round(cantidadSillas / SILLASBUS);
        }
        int comidasGordosDia = (_cantidadGordos * COMIDASGORDOS), comidasFlacosDia = (_cantidadFlacos * COMIDASFLACOS);
        int cantidadComidaDia = (comidasFlacosDia + comidasGordosDia), precioComidaDia = (cantidadComidaDia * VALORCOMIDA);
        int cantidadComidaTotal = (cantidadComidaDia * _diasPaseo), precioComidaTotal = (cantidadComidaTotal * VALORCOMIDA);
        int cantidadCuartos = Math.round((_cantidadGordos + _cantidadFlacos) / HABITACIONESTUDIANTES), precioCuartoDia = (cantidadCuartos * PRECIOHABITACION), precioCuartoTotal = (precioCuartoDia * _diasPaseo);

        imprimir("Cantidad de buses necesarios para el paseo: " + cantidadBuses);
        imprimir("Cantidad de platos servidos durante el paseo: " + cantidadComidaTotal);
        imprimir("Costo total de los platos servidos por día: " + precioComidaDia);
        imprimir("Costo total de los platos servidos durante el paseo: " + precioComidaTotal);
        imprimir("Número de habitaciones requeridas: " + cantidadCuartos);
        imprimir("Precio de habitaciones por día: " + precioCuartoDia);
        imprimir("Precio de habitaciones total del paseo: " + precioCuartoTotal);
    }

    private void imprimir(String mensaje) {
        System.out.println(mensaje);
    }
}
