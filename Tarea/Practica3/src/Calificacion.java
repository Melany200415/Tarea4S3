import java.util.Scanner;

public class Calificacion {
    String nombre;
    double n1, n2, n3;

    Scanner sc = new Scanner(System.in);

    public void ingresarDatos() {
        System.out.print("Nombre: ");
        nombre = sc.nextLine();

        System.out.print("Nota 1: ");
        n1 = sc.nextDouble();

        System.out.print("Nota 2: ");
        n2 = sc.nextDouble();

        System.out.print("Nota 3: ");
        n3 = sc.nextDouble();
    }

    public double calcularPromedio() {
        return (n1 + n2 + n3) / 3;
    }

    public String estado(double promedio) {
        if (promedio >= 7) {
            return "Aprobado";
        } else {
            return "Reprobado";
        }
    }

    public void mostrar() {
        double prom = calcularPromedio();

        System.out.println("-------- REPORTE ACADÉMICO --------");
        System.out.println("Nombre del estudiante: " + nombre);
        System.out.println("Promedio final del estudiante: " + prom);
        System.out.println("Estado: " + estado(prom));
        System.out.println("---------------------------------------");
    }
}