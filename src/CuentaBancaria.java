/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sebastian
 */
public class CuentaBancaria {
    public String NumeroCuenta;
    public String TipoCuenta;
    public int saldo;
    
    public CuentaBancaria(){
     NumeroCuenta = "Desconocido";
     TipoCuenta = "Desconocida";
     saldo= 0;
    }
    
    public CuentaBancaria(String NumeroCuenta, String TipoCuenta){
        this.NumeroCuenta = NumeroCuenta;
        this.TipoCuenta = TipoCuenta;
    }
    
    public CuentaBancaria(String NumeroCuenta, String TipoCuenta, int saldo){
        this.NumeroCuenta = NumeroCuenta;
        this.TipoCuenta = TipoCuenta;
        this.saldo = saldo;
    }
  
    
}
