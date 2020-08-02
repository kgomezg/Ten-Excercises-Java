/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capacidadcalorica;

import java.util.Scanner;

/**
 *
 * @author kgomezg81832
 * @date 2020.03.07
 * @desc Clase Operador
 */
public class Operador {

    // Variables de entrada
    private double _masa = 0, _temperatura = 0;
    private Scanner _entrada = new Scanner(System.in);

    public void _start() {

        imprimir("Escriba el valor de la masa");
        _masa = _entrada.nextInt();

        imprimir("Escriba el valor de la temperatura");
        _temperatura = _entrada.nextInt();

        imprimir("Se procesara la información");

        _procesar();
    }

    private void _procesar() {
        imprimir("");

        imprimir("Variable a: " + _masa);
        imprimir("Variable b: " + _masa);
    }

    private double _calcular() {
        return 1;
    }

    private void imprimir(String mensaje) {
        System.out.println(mensaje);
    }
}
