/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmetica;

import java.util.Scanner;

/**
 *
 * @author kgomezg81832
 * @date 2020.03.07
 * @desc Clase Operador
 */
public class Operador {

    // Variables de entrada
    private int _a = 0, _b = 0;
    private Scanner _entrada = new Scanner(System.in);

    public void _start() {

        imprimir("Escriba el valor de la variable a");
        _a = _entrada.nextInt();

        imprimir("Escriba el valor de la variable b");
        _b = _entrada.nextInt();

        imprimir("Se procesara la información");

        _procesar();
    }

    private void _procesar() {
        imprimir("");

        imprimir("Variable a: " + _a);
        imprimir("Variable b: " + _b);
        imprimir("La suma de a y b es: " + suma(_a, _b));
        imprimir("La resta de b y a es: " + resta(_b, _a));
        imprimir("El producto de a y b es: " + producto(_a, _b));
        imprimir("El cociente cuando a es dividido entre b es: " + cociente(_a, _b));
        imprimir("El residuo de la división de a entre b es: " + residuo(_a, _b));
        imprimir("El resultado de encontrar el logaritmo de a, es decir log a es: " + log(_a));
        imprimir("El resultado de a^b es: " + potencia(_a, _b));
    }

    private int suma(int a, int b) {
        return (a + b);
    }

    private int resta(int a, int b) {
        return (a - b);
    }

    private int producto(int a, int b) {
        return (a * b);
    }

    private String cociente(int a, int b) {
        if (b == 0) {
            return "No se puede divir entre 0";
        } else {
            return String.valueOf(a / b);
        }
    }

    private int residuo(int a, int b) {
        return (a % b);
    }

    private int log(int a) {
        return (int) Math.log(new Double(a));
    }

    private int potencia(int a, int b) {
        return (int) Math.pow(new Double(a), new Double(b));
    }

    private void imprimir(String mensaje) {
        System.out.println(mensaje);
    }
}
