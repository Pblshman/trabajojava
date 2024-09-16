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
    
    private double saldo;
    private double limite;
    private LocalDate fecha = LocalDate.now();    
    
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
    
    public Cuenta(){
    
    
    }
    
    public Cuenta(double saldo, double limite){
    
        this.saldo = saldo;
        this.limite = limite;
        
    }
    
}
