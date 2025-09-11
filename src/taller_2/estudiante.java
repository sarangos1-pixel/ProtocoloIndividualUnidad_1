/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_2;

/**
 *
 * @author Sebastian
 */
public class estudiante {
   public String nombre;
   public int edad;
    
   
   public estudiante(){
      this("Desconocido", 0);
              
   }
                
    public estudiante(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void MostrarDetalles(){
        System.out.println("El estudiante: " + this.nombre + ", tiene  una edad de " + 
                 this.edad + " años");
    }
    
    
}
