/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.asociacion;

/**
 *
 * @author ESTUDIANTES
 */

import java.util.ArrayList;

public class ClientePremium {
    
    private String nombre;
    private String apellido;
    private String id;
    
    private ArrayList<Cuenta> cuentas; 
    
    public ClientePremium(){
        this.cuentas = new ArrayList<>(); 
    }

    public ClientePremium(String nombre, String apellido, String id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.cuentas = new ArrayList<>(); 
    }

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

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
    
    public void addCuenta(Cuenta cuenta){
    
        cuentas.add(cuenta);
    
    }
    
    public void removeCuenta(Cuenta cuenta){
    
        cuentas.remove(cuenta);
    
    }
    
    public void mostrarCuentas(){
        
        for(int i = 0; i < getNumeroCuentas(); i++){
        
            System.out.println("La cuenta num " + (i + 1) + " tiene saldo " + cuentas.get(i).getSaldo());
        
        }
        
    }
    
    public Cuenta consultarCuenta(String id){
        
        Cuenta buscada = null;
    
        for(int i = 0; i < getNumeroCuentas(); i++){
        
            if(cuentas.get(i).getId().equals(id)){
            
                buscada = cuentas.get(i);
            
            }
        
        }
        
        return buscada;
    
    }
    
    public int getNumeroCuentas(){
    
        return cuentas.size();
        
    }

    @Override
    public String toString() {
        return "ClientePremium{" + "nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", cuentas=" + cuentas + '}';
    }
    
    
   
}
