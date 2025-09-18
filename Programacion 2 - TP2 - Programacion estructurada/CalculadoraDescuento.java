/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoradescuento;
import java.util.Scanner;
/**
 *
 * @author Matias
 */
public class CalculadoraDescuento {

    
    public static float aplicarDescuento(float precio,int porcentaje) {
        return precio - ( precio * ( porcentaje / 100.0f ) );
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        // Escribe un programa que solicite al usuario el precio de un producto y
        // su categoría (A, B o C).
        
        float precio;
        float precioFinal;
        char categoria;
        
        System.out.println("Ingrese el precio del producto: ");
        precio = input.nextFloat();
        input.nextLine();
        
        System.out.println("Ingrese la categoria del producto: ");
        String cadena = input.nextLine();
        categoria = cadena.toUpperCase().charAt(0);
        
        switch (categoria) {
            case 'A':
                precioFinal = aplicarDescuento(precio, 10);
                System.out.println("Descuento aplicado: 10%");
                System.out.println("El precio final es de : " + precioFinal);
                break;
            case 'B':
                precioFinal = aplicarDescuento(precio, 15);
                     System.out.println("Descuento aplicado: 15%");
                System.out.println("El precio final es de : " + precioFinal);
                break;
            case 'C':
                precioFinal = aplicarDescuento(precio, 20);
                     System.out.println("Descuento aplicado: 20%");
                System.out.println("El precio final es de : " + precioFinal);
                break;
            default:
                System.out.println("El precio ingresado no es válido.");
        }
    }
    
}
