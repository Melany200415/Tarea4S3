import java.util.Scanner;

public class Pedido {

    String cliente;
    String plato;
    double precio;
    int cantidad;

    Scanner sc = new Scanner(System.in);
    public void ingresarDatos() {
        System.out.print("Cliente: ");
        cliente = sc.nextLine();

        System.out.print("Plato: ");
        plato = sc.nextLine();

        System.out.print("Precio: ");
        precio = sc.nextDouble();

        System.out.print("Cantidad: ");
        cantidad = sc.nextInt();
    }

    public double calcularSubtotal() {
        return precio * cantidad;
    }
    public double calcularDescuento(double subtotal) {
        if (subtotal > 25) {
            return subtotal * 0.10;
        } else {
            return 0;
        }
    }
    public double calcularTotal(double subtotal, double descuento) {
        return subtotal - descuento;
    }
    public void mostrarCuenta() {
        double subtotal = calcularSubtotal();
        double descuento = calcularDescuento(subtotal);
        double total = calcularTotal(subtotal, descuento);

        System.out.println("----------- CUENTA DEL PEDIDO -------------");
        System.out.println("Cliente: " + cliente);
        System.out.println("Plato: " + plato);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Descuento: " + descuento);
        System.out.println("Total final: " + total);
    }


}