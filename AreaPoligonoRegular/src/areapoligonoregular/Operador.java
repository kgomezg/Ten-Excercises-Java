/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areapoligonoregular;

import java.util.Scanner;

/**
 *
 * @author kgomezg81832
 * @date 2020.03.07
 * @desc Ejercicio de Área Poligono Regular
 */
public class Operador {

    // Variable de entrada
    private static final double PI = Math.PI;
    private double _lados = 0, _longitud = 0;
    private Scanner _entrada = new Scanner(System.in);
    
    public void _start() {
        
        imprimir("Escriba la longitud de un lado:");
        _longitud = _entrada.nextDouble();
        
        imprimir("Escriba la cantidad de lados:");
        _lados = _entrada.nextDouble();
        
        imprimir("Se procesara la información");
        
        _procesar();
    }
    
    private void _procesar() {
        imprimir("");
        
        imprimir("Cantidad de lados: " + _lados);
        imprimir("Longitud dada: " + _longitud);
        imprimir("Area resultante: " + area() + " cm 2");
    }
    
    private double area() {
        return (_lados * Math.pow(_longitud, 2)) / (4 * Math.tan((Math.PI / _lados)));
    }
    
    private void imprimir(String mensaje) {
        System.out.println(mensaje);
    }
}
