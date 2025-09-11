/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_2;

/**
 *
 * @author Sebastian
 */
public class EjemploThis {
    public String nombre;
    
    //con error
    public static void ConError(){
            System.out.println(this.nombre);
    }
    
    //sin error
    public void MostrarNombre(){
        System.out.println(this.nombre);
        
    }
    
}
