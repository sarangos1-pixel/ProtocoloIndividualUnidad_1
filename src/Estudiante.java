/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sebastian
 */
public class Estudiante {
    public String nombre;
    public int edad;
    public int curso;
    
  public Estudiante(){
      nombre = "Desconocido";
      edad = 0;
      curso = 0;
  }
  
  public Estudiante(int edad, String nombre){
      this.edad = edad;
      this.nombre = nombre;
  }
  
  public Estudiante(int edad, String nombre, int curso){
      this(edad, nombre);
      this.curso = curso;
  }
}
