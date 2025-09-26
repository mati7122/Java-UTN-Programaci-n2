/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empleado;

/**
 *
 * @author Matias
 */
public class Empleado {

    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    static int totalEmpleados = 0;
    /**
     * @param args the command line arguments
     */
    
    // Constructores
    // Recibe todos los atributos como parametro
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.setId(id);
        this.setNombre(nombre);
        this.setPuesto(puesto);
        this.setSalario(salario);
        totalEmpleados++;
    }
    // id automatico y salario por defecto
    public Empleado(String nombre, String puesto) {
        this.id = totalEmpleados;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 400;
        totalEmpleados++;
    }
    
    // Metodo actualizar salario
    // Actualizar salario por porcentaje
    public double actualizarSalario(int porcentaje) {
        if(porcentaje > 100 || porcentaje <= 0) {
            System.out.println("El número de porcentaje introducido no es valido.");
            return this.salario;
        }
        else {
            double factor = porcentaje / 100.00;
            this.salario = this.salario + (this.salario  * factor);
            return this.salario;
        }    
    }
    
    // Actualizar salario por cantidad fija
    public double actualizarSalario(double cantidadFija) {
        if(cantidadFija > this.salario || cantidadFija <= 0) {
            System.out.println("Debe proporcionar una cantidad valida que no supere el monto actual del salario.");
            return 0;
        }
        else {
            this.salario += cantidadFija;
            return this.salario;
        }
    }
    
    static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    //método toString()
    
    @Override
    public String toString() {
        return String.format("[id: %d, nombre: %s, puesto: %s, salario: %f ]", this.id, this.nombre, this.puesto, this.salario);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado empleado1 = new Empleado(1, "Matias", "encargado", 300);
        Empleado empleado2 = new Empleado(3, "Fabian", "recepcionista", 300);
        Empleado empleado3 = new Empleado("Juan", "abogado");
        Empleado empleado4 = new Empleado("Carlos", "seguridad");
        
        empleado1.actualizarSalario(20); // Se aumenta el salario de empleado1 un 20%;
        empleado2.actualizarSalario(35); // Se aumenta un 35%
        empleado3.actualizarSalario(200.000); // Se aumenta salario de forma fija
        
        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());
        System.out.println(empleado3.toString());
        
        System.out.println("Total empleados: " + mostrarTotalEmpleados());
    }
    
}


