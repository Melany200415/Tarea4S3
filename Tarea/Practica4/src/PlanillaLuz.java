import java.util.Scanner;

public class PlanillaLuz {

    String cliente;
    double consumo;
    double costoKW;

    Scanner sc = new Scanner(System.in);
    public void ingresarDatos() {
        System.out.print("Ingrese el nombre del cliente: ");
        cliente = sc.nextLine();

        System.out.print("Ingrese el consumo (kW): ");
        consumo = sc.nextDouble();

        System.out.print("Ingrese el costo por kW: ");
        costoKW = sc.nextDouble();
    }
    public double calcularSubtotal() {
        return consumo * costoKW;
    }
    public double calcularIVA(double subtotal) {
        return subtotal * 0.15;
    }
    public double calcularTotal(double subtotal, double iva) {
        return subtotal + iva;
    }
    public void mostrarPlanilla() {
        double subtotal = calcularSubtotal();
        double iva = calcularIVA(subtotal);
        double total = calcularTotal(subtotal, iva);

        System.out.println("----------- PLANILLA DE LUZ -----------");
        System.out.println("Cliente: " + cliente);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("IVA: " + iva);
        System.out.println("Total a pagar: " + total);
        System.out.println("---------------------------------------");
    }


}