import java.util.Scanner;

public class Estudiante {

        String nombre;
        String carrera;
        int edad;
        Scanner sc = new Scanner(System.in);

        public void registrarDatos(){
            System.out.println("Ingrese el nombre: ");
            nombre = sc.nextLine();

            System.out.println("Ingrese la carrera: " );
            carrera = sc.nextLine();

            System.out.println("Ingrese la edad: ");
            edad= sc.nextInt();
        }
        public void mostrarDatos(){
            System.out.println("========Datos del Estudiante=========");
            System.out.println("Nombre del estuante: "+nombre);
            System.out.println("Carrera del estudiante: "+carrera);
            System.out.println("La edad del  estuante: "+edad);
        }

}
