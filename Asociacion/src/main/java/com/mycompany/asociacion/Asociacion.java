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
        
        Cuenta cuenta1 = new Cuenta("1" ,12, 10);
        Cuenta cuenta2 = new Cuenta("2", 0, 0);
        Cuenta cuenta3 = new Cuenta("3", 0, 0);
        Cliente cliente = new Cliente("Juan", "Perez", "3254", cuenta1);
        ClientePremium clientePremium = new ClientePremium("Jose", "Ramirez", "421");

        System.out.println("El saldo del cliente en la fecha " + (cliente.getCuenta()).getFecha() + " es " + (cliente.getCuenta()).getSaldo());   
        
        cliente.setCuenta(cuenta2);
        
        System.out.println("El saldo del cliente en la fecha " + (cliente.getCuenta()).getFecha() + " es " + (cliente.getCuenta()).getSaldo());   

        cliente.consignarALaCuenta(2000);
        cliente.getCuenta().getSaldo();        

        System.out.println("El saldo del cliente en la fecha " + (cliente.getCuenta()).getFecha() + " es " + (cliente.getCuenta()).getSaldo());  
        
        clientePremium.addCuenta(cuenta1);
        clientePremium.addCuenta(cuenta2);
        
        System.out.println("El numero de cuentas del cliente premium son " + clientePremium.getNumeroCuentas());
        
        clientePremium.mostrarCuentas();
        
        clientePremium.removeCuenta(cuenta1);
        
        clientePremium.mostrarCuentas();
        
        System.out.println("El numero de cuentas del cliente premium son " + clientePremium.getNumeroCuentas());
        
        System.out.println(clientePremium.toString());
        
        System.out.println(clientePremium.consultarCuenta(cuenta3.getId()));
        System.out.println(clientePremium.consultarCuenta(cuenta2.getId()));


    }
}
