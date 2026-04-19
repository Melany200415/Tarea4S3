import java.util.Scanner;

public class Empleado {
    String nombre;
    int horas;
    double pagoHora;
    Scanner sc = new Scanner(System.in);
    public void ingresarDatos() {
        System.out.print("Ingrese nombre del trabajador: ");
        nombre = sc.nextLine();

        System.out.print("Horas trabajadas: ");
        horas = sc.nextInt();

        System.out.print("Pago por hora: ");
        pagoHora = sc.nextDouble();
    }
    public double calcularSueldoBase() {
        return horas * pagoHora;
    }
    public double calcularBono(double sueldoBase) {
        return 20;
    }
    public double calcularSueldoFinal(double sueldoBase, double bono) {
        return sueldoBase + bono;
    }
    public void mostrarReporte() {
        double sueldoBase = calcularSueldoBase();
        double bono = calcularBono(sueldoBase);
        double sueldoFinal = calcularSueldoFinal(sueldoBase, bono);

        System.out.println("----------- REPORTE DE EMPLEADO -----------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Sueldo base: " + sueldoBase);
        System.out.println("Bono: " + bono);
        System.out.println("Sueldo final: " + sueldoFinal);
        System.out.println("-------------------------------------------");
    }

}