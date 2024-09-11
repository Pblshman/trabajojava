/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajo2;

/**
 *
 * @author ESTUDIANTES
 */
public class Informe {
    double[] ventas = new double[12];
    
    public Informe(double ventas[]){
        this.ventas = ventas;
    }
    
    public double[]  getVentas(){
        return ventas;
    }
    
    public void setVentas(double[] ventas){
        this.ventas = ventas;
    }
    
    public double promedioVentasAño(){
        
        double sumaMeses = 0;
        
        for(int i = 0; i < 12; i++){
            sumaMeses = sumaMeses + ventas[i];
        }
        
        double resultado = sumaMeses / 12;
        
        return resultado;
    }
    
    public int mesMenosVentas(){
        int mesMenos = 0;
        
        for(int i = 0; i < 12; i++){
            
            if(ventas[i] < mesMenos){
               mesMenos = i; 
            }
            
        }
        
        return mesMenos;
    }
    
    public int mesMasVentas(){
        int mesMas = 0;
        
        for(int i = 0; i < 12; i++){
            
            if(ventas[i] > mesMas){
               mesMas = i; 
            }
            
        }
        
        return mesMas;

    }
}
