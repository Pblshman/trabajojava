/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicioherencia;

/**
 *
 * @author ESTUDIANTES
 */
public class EjercicioHerencia {

    public static void main(String[] args) {
        
        Persona person = new Persona(34, "Jose", "Rodriguez", 55);

        Doctor doct = new Doctor("General", "Lamazza", person);
        System.out.println(doct.toString());
        
        Teacher teacher = new Teacher("Ingenieria de Sistemas", "UPC", 3, "Jose", "Ramirez", 42);
        System.out.println(teacher.toString());
        
        
    }
}
