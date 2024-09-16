/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication18;

/**
 *
 * @author ESTUDIANTES
 */
public class Rectangulo {
    
    private double base;
    private double altura;

    public static int BORDE = 5;

    
    public Rectangulo(){
    
    }
    
    public Rectangulo(double altura){
 
        this.base = 10;
        this.altura = altura;
        
    }
    
    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
   
    public double calcularArea(){
        double areaRectangulo = this.base * this.altura;
        return areaRectangulo;
    }
     
    public double calcularPerimetro(){
        double perimetroRectangulo = 2*this.base + 2*this.altura;
        return perimetroRectangulo;
    }
    
    public double sumarAreaRectangulos(double base, double altura){
    
        Rectangulo rect = new Rectangulo(base, altura);
        return(sumarAreaRectangulos(rect));
        
    }
    
    public double sumarAreaRectangulos(double area){
    
        return calcularArea() + area;
    }
    
    public double sumarAreaRectangulos(Rectangulo rect){
        
        return calcularArea() + rect.calcularArea();
        
    }
    
}
