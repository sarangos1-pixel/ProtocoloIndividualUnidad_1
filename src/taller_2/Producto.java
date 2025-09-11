/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_2;

/**
 *
 * @author Sebastian
 */
public class Producto {
    public String nombre;
    public int precio;
    
    public Producto(String nombre, int precio){
        this.nombre = nombre;
        this.precio = precio;
        
    }
    
    public void MostrarDetalles(){
        System.out.println("El producto: " + nombre + " cuesta " + precio + "$");
    } 
}
