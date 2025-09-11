/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sebastian
 */
public class Libro {
    private String Titulo;
    private String autor;
    private int NumPag;
    
  public Libro(){
      Titulo =  "Desconocido";
      autor = "Desconocido";
      NumPag = 0;
  }
  
  public Libro(String Titulo, String autor, int NumPag){
      this.Titulo = Titulo;
      this.autor = autor;
      this.NumPag = NumPag;
  }
  
  public String toString(){
      return "libro [Titulo: " + Titulo + ", autor: " + autor 
              + ", numero de paginas: " + NumPag + "]";
  }
  
    
}
