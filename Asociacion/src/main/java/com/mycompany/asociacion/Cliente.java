/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.asociacion;

/**
 *
 * @author ESTUDIANTES
 */
public class Cliente {
    
    private String nombre;
    private String apellido;
    private String id;
    
    private Cuenta cuenta;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
      
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    
    public Cliente(){}
    
    public Cliente(String nombre, String apellido, String id, Cuenta cuenta){
    
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuenta = cuenta;
        
    }
    
    public void consignarALaCuenta(double valor){
    
        this.cuenta.consignar(valor);
        System.out.println("El saldo de la cuenta es " + this.cuenta.getSaldo());
        
    }
    
    public double getSaldoCuenta(){
    
        return(this.cuenta.getSaldo());
        
    }
    
}
