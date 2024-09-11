/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabajo2;

/**
 *
 * @author ESTUDIANTES
 */
public class Trabajo2 {

    public static void main(String[] args) {
        Informe inf = new Informe(new double[]{3,2,2,1,2,2,2,2,5,2,2,2});
        System.out.println("El promedio es: " + inf.promedioVentasAño());
        System.out.println("El mes con menos ventas fue: " + inf.mesMenosVentas());
        System.out.println("El mes con mas ventas fue: " + inf.mesMasVentas());

    }
}
