/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package volumencono;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author kgomezg81832
 * @date 2020.03.07
 * @desc Clase VolumenCono
 */
public class Operador {

    // Variable de entrada
    private static final double PI = Math.PI;
    private static final DecimalFormat DF = new DecimalFormat("#.##"); // para formatear a 2 decimales
    private double radioPrincipal = 0, alturaPrincipal = 0;
    private double radioSecundario = 0, alturaSecundario = 0;
    private Scanner _entrada = new Scanner(System.in);


    public void _start() {

        imprimir("Escriba el radio del cono completo.");
        radioPrincipal = _entrada.nextDouble();

        imprimir("Escriba la altura del cono completo.");
        alturaPrincipal = _entrada.nextDouble();

        imprimir("Escriba el radio del cono deficiente.");
        radioSecundario = _entrada.nextDouble();

        imprimir("Escriba la altura del cono deficiente.");
        alturaSecundario = _entrada.nextDouble();

        imprimir("Se procesara la información");

        _procesar();
    }

    private void _procesar() {
        imprimir("");

        imprimir("Radio del cono completo: " + radioPrincipal);
        imprimir("Altura del cono completo: " + alturaPrincipal);
        imprimir("Área del cono completo: " + (PI * Math.pow(radioPrincipal, 2)));

        imprimir("");

        imprimir("Radio del cono deficiente: " + radioSecundario);
        imprimir("Altura del cono deficiente: " + alturaSecundario);
        imprimir("Área del cono deficiente: " + (PI * Math.pow(radioSecundario, 2)));

        double volumenTronco = (alturaPrincipal * PI / 3) * (Math.pow(radioPrincipal, 2) + Math.pow(radioSecundario, 2) + radioPrincipal * radioSecundario);

        imprimir("");

        imprimir("Volumen tronco de cono: " + volumenTronco);
    }

    private void imprimir(String mensaje) {
        System.out.println(mensaje);
    }
}
