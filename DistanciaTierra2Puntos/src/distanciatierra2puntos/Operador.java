/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distanciatierra2puntos;

import java.util.Scanner;

/**
 *
 * @author goke9
 */
public class Operador {

    // Variable de entrada
    private static final double RADIO = 6371;
    private double _lat1, _lat2, _lon1, _lon2;
    private Scanner _entrada = new Scanner(System.in);

    public void _start() {

        imprimir("Escriba la latitud de la ciudad 1");
        _lat1 = _entrada.nextDouble();

        imprimir("Escriba la longitud de la ciudad 1");
        _lon1 = _entrada.nextDouble();

        imprimir("Escriba la latitud de la ciudad 2");
        _lat2 = _entrada.nextDouble();

        imprimir("Escriba la longitud de la ciudad 2");
        _lon2 = _entrada.nextDouble();

        imprimir("Se procesara la información");

        _procesar();
    }

    private void _procesar() {
        imprimir("");

        imprimir("Distancia entre ciudades: " + Distancia());
    }

    private double Distancia() {
        _lat1 = Math.toRadians(_lat1);
        _lon1 = Math.toRadians(_lon1);
        _lat2 = Math.toRadians(_lat2);
        _lon2 = Math.toRadians(_lon2);

        return ((2 * Math.asin(
                Math.sqrt(
                        Math.pow(
                                Math.sin(
                                        (_lat2 - _lat1)
                                        / 2),
                                2)
                        + Math.cos(_lat1) * Math.cos(_lat2)
                        * Math.pow(
                                Math.sin(
                                        (_lon2 - _lon1)
                                        / 2),
                                2)
                )
        )) * RADIO);
    }

    private void imprimir(String mensaje) {
        System.out.println(mensaje);
    }
}
