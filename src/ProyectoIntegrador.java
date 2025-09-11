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
        key.nextLine();
 
        Libro TuLibro = new Libro(titulo, autor, NumPaginas);
        System.out.println("detalles de tu libro: " + TuLibro);
        
        
        //cuenta bancaria
        System.out.println("****CUENTA BANCARIA****");
        
        System.out.println("Ingrese su nombre de usuario");
        String usuario = key.nextLine();
        
        System.out.println("ingrese su numero de cuenta");
        String NumCuenta = key.nextLine();
        
        System.out.println("ingrese su tipo de cuenta");
        String TipoCuenta = key.nextLine();
        
        System.out.println("ingrese su saldo");
        int saldo = key.nextInt();
        key.nextLine();
                 
        CuentaBancaria CuentaUsuario = new CuentaBancaria(NumCuenta, TipoCuenta, saldo);
        System.out.println(usuario + " estos son los detalles de su cuenta bancaria: " + CuentaUsuario);
        
        
        
    }
   
}
