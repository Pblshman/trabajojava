/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo1;

/**
 *
 * @author ESTUDIANTES
 */
public class Cuenta {
    int noCuenta;
    String nombreCliente;
    double saldo;
    
    public Cuenta(int noCuenta, String nombreCliente, double saldo){
        this.noCuenta = noCuenta;
        this.nombreCliente = nombreCliente;
        this.saldo = saldo;
    }

    public int getNoCuenta() {
        return noCuenta;
    }

    public void setNoCuenta(int noCuenta) {
        this.noCuenta = noCuenta;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    boolean consignar(double monto){
        return saldo > monto;
    }
    
    boolean retirar(double monto){
        return saldo > monto;
    }
}
