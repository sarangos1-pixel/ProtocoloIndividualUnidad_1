/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Sebastian
 */
import java.util.Scanner;
        
public class ProyectoIntegrador {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        
        Libro libro_1 = new Libro();
        System.out.println("tu libro: " + libro_1);
        
        //datos ingresados (libro)
        String titulo;
        String autor;
        int NumPaginas;
        
        
        System.out.println("ingresa el titulo del libro");
        titulo = key.nextLine();
        
        System.out.println("ingrese el autor de su libro");
        autor = key.nextLine();
        
        System.out.println("ingrese el numero de paginas del libro");
        NumPaginas = key.nextInt(); 
        
 
        Libro TuLibro = new Libro(titulo, autor, NumPaginas);
        System.out.println("detalles de tu libro: " + TuLibro);
        
    }
   
}
