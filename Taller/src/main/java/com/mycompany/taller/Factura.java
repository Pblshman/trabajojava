/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller;

import java.util.ArrayList;

/**
 *
 * @author yo
 */
public class Factura {
    
    private double porcentajeIva;
    private double porcentajeDescuento;
    private double subtotal;
    private double total;
    private Cliente cliente;
    ArrayList<Articulo> articulos;

    public Factura() {
        
        articulos = new ArrayList<>();
        
    }

    public Factura(double porcentajeIva, double porcentajeDescuento, double subtotal, double total, Cliente cliente, ArrayList<Articulo> articulos) {
        this.porcentajeIva = porcentajeIva;
        this.porcentajeDescuento = porcentajeDescuento;
        this.subtotal = subtotal;
        this.total = total;
        this.cliente = cliente;
        this.articulos = articulos;
    }

    public double getPorcentajeIva() {
        return porcentajeIva;
    }

    public void setPorcentajeIva(double porcentajeIva) {
        this.porcentajeIva = porcentajeIva;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(ArrayList<Articulo> articulos) {
        this.articulos = articulos;
    }
    
    public void agregarArticulo(Articulo art){
        
        boolean estaRepetido = false;
    
        for(int i = 0; i < articulos.size(); i++){
        
            if(art.getCodigo().equals(articulos.get(i).getCodigo())){
            
                estaRepetido = true;
                
            }
            
        }
        
        if(estaRepetido == true){
        
            System.out.println("El elemento no se puede ingresar. Esta repetido");
          
            
        }else{
        
            articulos.add(art);
            
        }
        
    }
    
    public void obtenerImporte(){
    
        if(articulos.size() == 0){
        
            this.subtotal = 0;
            this.total = 0;
            
        }else{
            
            this.subtotal = 0;
            double valorIva;
            double valorDescuento;
        
            for(int i = 0; i < articulos.size(); i++){
            
                this.subtotal = this.subtotal + articulos.get(i).getPrecio();
            
            }
            
            valorIva = this.subtotal * porcentajeIva;
            valorDescuento = this.subtotal * porcentajeDescuento;
            
            this.total = this.subtotal + valorDescuento - valorIva;
            
        }
        
    }
    
    public void ticket(){
    
        System.out.println("El porcentaje del iva es igual a " + this.porcentajeIva);
        System.out.println("El porcentaje del descuento es igual a " + this.porcentajeDescuento);
        System.out.println("El subtotal es igual a " + this.subtotal);
        System.out.println("El total es igual a " + this.total);
    System.out.println("El cliente es igual a " + this.cliente);
        System.out.println("Los articulos son iguales a " + this.articulos);
        
    }


    
    
            
}
