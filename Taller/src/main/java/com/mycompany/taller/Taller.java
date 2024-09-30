/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taller;

/**
 *
 * @author yo
 */
public class Taller {

    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente("1003903", "Juan", "Gonzalez", "Santos", "891391");
        Articulo articulo1 = new Articulo("12", "arroz", 321);
        Articulo articulo2 = new Articulo("15", "papa", 321);
        Articulo articulo3 = new Articulo("21", "frijol", 321);

        Factura factura1 = new Factura();
        
        factura1.setCliente(cliente1);
        factura1.setPorcentajeIva(0.10);
        factura1.setPorcentajeDescuento(0.3);
        factura1.agregarArticulo(articulo1);
        factura1.agregarArticulo(articulo2);
        factura1.agregarArticulo(articulo3);
        
        factura1.obtenerImporte();
        factura1.ticket();

        
    }
}
