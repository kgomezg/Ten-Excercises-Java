/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sasaima;

import java.util.Scanner;

/**
 *
 * @author kgomezg81832
 * @date 2020.03.07
 * @desc Clase Operador
 */
public class Operador {

    // Variable de entrada
    private static final int DISTANCIASASAIMABOGOTA = 79;
    private int precioGasolinaPorGalon = 10000;
    private int _kilosPorEntregar = 0, _kilosPorViaje = 0, _galonesPorViaje = 0;
    private Scanner _entrada = new Scanner(System.in);

    public void _start() {

        imprimir("Escriba la cantidad de kilos que entregaran.");
        _kilosPorEntregar = _entrada.nextInt();

        imprimir("Escriba la cantidad de kilos que se soporta el camión.");
        _kilosPorViaje = _entrada.nextInt();

        imprimir("Escriba la cantidad de galones que consumira por kilómetro.");
        _galonesPorViaje = _entrada.nextInt();

        imprimir("Se procesara la información");

        _procesar();
    }

    private void _procesar() {
        imprimir("");

        imprimir("Kilos para entregar: " + _kilosPorEntregar);
        imprimir("Kilos soportados por el camión: " + _kilosPorViaje);
        imprimir("Cantidad de galones que consumira por viaje: " + _galonesPorViaje);

        int cantidadViajes = Math.round(_kilosPorEntregar / _kilosPorViaje), gasolinaTotalViaje = (cantidadViajes * _galonesPorViaje), precioGasolinaTotal = (gasolinaTotalViaje * precioGasolinaPorGalon);

        imprimir("Cantidad de viajes necesarios para transportar todos los kilos: " + cantidadViajes);

        imprimir("Cantidad de galones necesarios para todos los viajes: " + gasolinaTotalViaje);

        imprimir("Precio total de gasolina: " + precioGasolinaTotal);
    }

    private void imprimir(String mensaje) {
        System.out.println(mensaje);
    }
}
