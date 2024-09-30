/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller;

/**
 *
 * @author yo
 */
public class Cliente {
   
    private String noIdentificacion;
    private String nombre;
    private String apellido;
    private String direccion;
    private String noTelefono;

    public Cliente() {
    }

    public Cliente(String noIdentificacion, String nombre, String apellido, String direccion, String noTelefono) {
        this.noIdentificacion = noIdentificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.noTelefono = noTelefono;
    }

    public String getNoIdentificacion() {
        return noIdentificacion;
    }

    public void setNoIdentificacion(String noIdentificacion) {
        this.noIdentificacion = noIdentificacion;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNoTelefono() {
        return noTelefono;
    }

    public void setNoTelefono(String noTelefono) {
        this.noTelefono = noTelefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "noIdentificacion=" + noIdentificacion + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", noTelefono=" + noTelefono + '}';
    }
    
    
    
}
