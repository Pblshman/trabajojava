/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabajo3;

/**
 *
 * @author ESTUDIANTES
 */
public class Trabajo3 {

    public static void main(String[] args) {
        
        Piscina pis1 = new Piscina(20);
        System.out.println("El nivel de agua es: " + pis1.getNivelActual());
        pis1.agregarAgua(190);
        System.out.println("El nivel de agua es: " + pis1.getNivelActual());
        pis1.sacarAgua(190);
        System.out.println("El nivel de agua es: " + pis1.getNivelActual());
        pis1.llenar();
        System.out.println("El nivel de agua es: " + pis1.getNivelActual());
        pis1.vaciar();
        System.out.println("El nivel de agua es: " + pis1.getNivelActual());
        pis1.agregarAgua(1000);
        System.out.println("El nivel de agua es: " + pis1.getNivelActual());
        pis1.sacarAgua(1000);
        System.out.println("El nivel de agua es: " + pis1.getNivelActual());

    }
}
