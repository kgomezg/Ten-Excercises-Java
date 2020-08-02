/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eficienciacombustible;

import java.util.Scanner;

/**
 *
 * @author kgomezg81832
 * @date 2020.03.07
 * @desc Clase Operador
 */
public class Operador {

    // Variable de entrada
    private static final double B = 235.214583;
    private int _a = 0;
    private Scanner _entrada = new Scanner(System.in);

    public void _start() {

        imprimir("Escriba el valor de eficiencia en MPG");
        _a = _entrada.nextInt();

        imprimir("Se procesara la información");

        _procesar();
    }

    private void _procesar() {
        imprimir("");

        imprimir("MPG dado: " + _a);
        imprimir("LPK resultante: " + convertir(_a));
    }

    private String convertir(int a) {
        if (a == 0) {
            return "No se acepta 0 (cero) como MPG.";
        } else {
            return String.valueOf(B / a);
        }
    }

    private void imprimir(String mensaje) {
        System.out.println(mensaje);
    }
}
