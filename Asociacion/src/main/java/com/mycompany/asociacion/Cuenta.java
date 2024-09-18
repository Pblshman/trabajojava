/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.asociacion;

import java.time.LocalDate;

/**
 *
 * @author ESTUDIANTES
 */
public class Cuenta {
    
    private String id;
    private double saldo;
    private double limite;
    private LocalDate fecha = LocalDate.now();    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    public Cuenta(){}
    
    public Cuenta(String id, double saldo, double limite){
    
        this.id = id; 
        this.saldo = saldo;
        this.limite = limite;
    
    }
    
    public void consignar(double valor){
    
        this.saldo = this.saldo + valor; 
        
    }
    
    public void retirar(double valor){
    
        if(valor > this.saldo){
        
            System.out.println("EL VALOR A RETIRAR ES MAYOR AL SALDO DE LA CUENTA");
        
        }else{
        
            this.saldo = this.saldo - valor;
        
        }
    
    }
    
}
