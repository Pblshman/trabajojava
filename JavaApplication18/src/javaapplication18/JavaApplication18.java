/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication18;

/**
 *
 * @author ESTUDIANTES
 */
public class JavaApplication18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo rect1 = new Rectangulo(2,4);
        Rectangulo rect2 = new Rectangulo(3,1);
        System.out.println("La suma de las areas es: " + rect1.sumarAreaRectangulos(3,1));
        System.out.println("El borde del rectangulo es " + Rectangulo.BORDE);
        mostrarRectangulo(rect1);
        mostrarRectangulo(rect2);

    }
    
    public static void mostrarRectangulo(Rectangulo r){
        System.out.println("La altura del rectangulo es " + r.getAltura());
        System.out.println("La base del rectangulo es " + r.getBase());
        System.out.println("El area del rectangulo es " + r.calcularArea());
        System.out.println("El perimetro del rectangulo es " + r.calcularPerimetro());

    }
    
}
