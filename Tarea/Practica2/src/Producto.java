import java.util.Scanner;
public class Producto {
String nombrepro;
double precio;
double cantidad;
Scanner sc = new Scanner(System.in);
public void ingresarDatos (){
    System.out.println("Ingrese el nombre del producto: ");
    nombrepro=sc.nextLine();
    System.out.println("Ingrese el precio del producto: ");
    precio = sc.nextDouble();
    System.out.println("Ingrese la cantidad del producto: ");
    cantidad= sc.nextDouble();
}
public void mostrarFactura(){
    //Calculos
    double total =precio*cantidad;
    if (total>1000) {
        total=total-(total*0.10);
    }
        System.out.println("==============Factura============");
System.out.println("Producto: "+nombrepro);
System.out.println("Precio unitario: "+ precio);
System.out.println( "Cantidad: "+cantidad);
System.out.println("Total a pagar: "+total);
System.out.println("==================================");
}
}
