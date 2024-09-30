/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioherencia;

/**
 *
 * @author ESTUDIANTES
 */
public class TeacherConPosgrado extends Teacher {
    
    private int añoFinPosgrado;
    private String universidadPosgrado;
    private double promedioPosgrado;

    public TeacherConPosgrado() {
    }

    public TeacherConPosgrado(String program, String university, int id, String name, String lastName, int age) {
        super(program, university, id, name, lastName, age);
    }

    public TeacherConPosgrado(String program, String university, Persona person) {
        super(program, university, person);
    }

    public int getAñoFinPosgrado() {
        return añoFinPosgrado;
    }

    public void setAñoFinPosgrado(int añoFinPosgrado) {
        this.añoFinPosgrado = añoFinPosgrado;
    }

    public String getUniversidadPosgrado() {
        return universidadPosgrado;
    }

    public void setUniversidadPosgrado(String universidadPosgrado) {
        this.universidadPosgrado = universidadPosgrado;
    }

    public double getPromedioPosgrado() {
        return promedioPosgrado;
    }

    public void setPromedioPosgrado(double promedioPosgrado) {
        this.promedioPosgrado = promedioPosgrado;
    }

    @Override
    public String toString() {
        return "TeacherConPosgrado{" + "a\u00f1oFinPosgrado=" + añoFinPosgrado + ", universidadPosgrado=" + universidadPosgrado + ", promedioPosgrado=" + promedioPosgrado + '}';
    }
    
    
    
}
