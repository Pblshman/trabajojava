/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioherencia;

/**
 *
 * @author ESTUDIANTES
 */
public class Doctor extends Persona {
    
    private String specialty;
    private String hospital;

    public Doctor() {
    }

    public Doctor(String specialty, String hospital, int id, String name, String lastName, int age) {
        super(id, name, lastName, age);
        this.specialty = specialty;
        this.hospital = hospital;
    }
    
    public Doctor(String specialty, String hospital, Persona person){
    
        this(
                specialty,
                hospital,
                person.getId(),
                person.getName(),
                person.getLastName(),
                person.getAge()            
        );
        
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    
    
    @Override
    public String toString() {
        return "Doctor{" + "specialty=" + specialty + ", hospital=" + hospital + '}' + super.toString();
    }
    
}
