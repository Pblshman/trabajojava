/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabajo4;

/**
 *
 * @author ESTUDIANTES
 */
public class Trabajo4 {
    
    static void infoLibros(Libro[] libro){
        for(int i = 0; i < 5; i++){
            System.out.println("Titulo: " + libro[i].getTitulo());
            System.out.println(libro[i].getEdicion() + "a. edicion");
            System.out.println("Autor: " + libro[i].getPrimerApellido() + ", " + libro[i].getSegundoNombre().charAt(0) + ". " + libro[i].getPrimerNombre());
            System.out.println("Titulo: " + libro[i].getTitulo());
            System.out.println("Editorial: " + libro[i].getEditorial());

        }
    }

    public static void main(String[] args) {
        
        Libro[] libros = new Libro[5];

        libros[0] = new Libro("Maita", "Juan", "Jose", "Rodriguez", 12, 2, "Buenos Aires", "Argentina", "04-09-1996");
        libros[1] = new Libro("Pep", "Carlos", "Jose", "Jose", 32, 2, "Buenos Aires", "Argentina", "04-09-1991");
        libros[2] = new Libro("Auras", "Juan", "Juan", "Pereira", 12, 2, "Cordoba", "Argentina", "11-09-2000");
        libros[3] = new Libro("Estepas", "Esteban", "Jose", "Mina", 12, 2, "Monteria", "Colombia", "04-09-2010");
        libros[4] = new Libro("Astrid", "Maria", "Jose", "Rodriguez", 12, 2, "Buenos Aires", "Argentina", "04-09-2024");

        infoLibros(libros);
    }
}
