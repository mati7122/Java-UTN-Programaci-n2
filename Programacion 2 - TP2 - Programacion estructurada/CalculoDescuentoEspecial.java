/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculodescuentoespecial;
import java.util.Scanner;
/**
 *
 * @author Matias
 */
public class CalculoDescuentoEspecial {
    
    static double precioProducto = 0;
    static double entradaSalida = 0.10;
    
    static double calcularDescuentoEspecial(double precio) {
        double descuentoAplicado;
        descuentoAplicado = precio * entradaSalida;
        return descuentoAplicado;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el precio del producto: ");
        precioProducto = Double.parseDouble(input.nextLine());
        
        System.out.println("El descuento especial aplicado es: " + calcularDescuentoEspecial(precioProducto));
        
        System.out.println("El precio final con descuento es: " +  ( precioProducto - calcularDescuentoEspecial(precioProducto)));
        
    }
    
}
