/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajo3;

/**
 *
 * @author ESTUDIANTES
 */
public class Piscina {
    
    double nivelActual;
    
    public Piscina(){}
    
    public Piscina(double nivelActual){
        this.nivelActual = nivelActual;
    }
        
    public double getNivelActual() {
        return nivelActual;
    }

    public void setNivelActual(double nivelActual) {
        this.nivelActual = nivelActual;
    }
    
    public void llenar(){
        this.nivelActual = 1000;
    }
    
    public void vaciar(){
        this.nivelActual = 0;
    }
    
    public void agregarAgua(double cantidad){
        
        if( (this.nivelActual + cantidad) > 1000 ){
            
            System.out.println("No se puede agregar mas agua");
            
        }else{
            
            this.nivelActual = this.nivelActual + cantidad;
            
        }
        
    }
    
    public void sacarAgua(double cantidad){
        
        if( (this.nivelActual - cantidad) < 0 ){
            
            System.out.println("No se puede sacar agua");
            
        }else{
            
            this.nivelActual = this.nivelActual - cantidad;
            
        }
    }
}
