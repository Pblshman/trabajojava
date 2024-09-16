/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.asociacion;

/**
 *
 * @author ESTUDIANTES
 */
public class Asociacion {

    public static void main(String[] args) {
        
        Cuenta cuenta = new Cuenta(12, 10);
        Cliente cliente = new Cliente("Juan", "Perez", "3254", cuenta);
              
        System.out.println("El saldo del cliente en la fecha " + (cliente.getCuenta()).getFecha() + " es " + (cliente.getCuenta()).getSaldo());   
        
    }
}
