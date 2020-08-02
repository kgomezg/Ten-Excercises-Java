/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package áreavolumen;

import java.util.Scanner;

/**
 *
 * @author kgomezg81832
 * @date 2020.03.07
 * @desc Ejercicio de Área y Volumen.
 */
public class Operador {

    // Variable de entrada
    private static final double PI = Math.PI;
    private int _r = 0;
    private Scanner _entrada = new Scanner(System.in);

    public void _start() {

        imprimir("Escriba el valor del radio");
        _r = _entrada.nextInt();

        imprimir("Se procesara la información");

        _procesar();
    }

    private void _procesar() {
        imprimir("");

        imprimir("Radio dado: " + _r);
        imprimir("Area resultante: " + area() + " cm 2");
        imprimir("Volumen resultante: " + volumen() + " cm 3");
    }

    private double area() {
        return Math.pow(_r, 2) * PI;
    }

    private double volumen() {
        return (Math.pow(_r, 3) * PI) * 0.75;
    }

    private void imprimir(String mensaje) {
        System.out.println(mensaje);
    }
}
