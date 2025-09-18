/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculodescuentovariableglobal;
import java.util.Scanner;
/**
 *
 * @author Matias
 */
public class ModificarArray {

    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        double[] preciosProductos = {199.99, 299.99, 47.99, 399.0};
        
        // Precios originales
        System.out.println("Precios originales");
        for (double n : preciosProductos) {
            System.out.println(n);
        }
        
        preciosProductos[1] = 59.99;
        
        System.out.println("Precios modificados");
        for (double n : preciosProductos) {
            System.out.println(n);
        }
        
    }
    
}
