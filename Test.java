package Tarea_8;
import java.util.Scanner;

/**
 * En esta clase pediremos 2 datos que compararemos con 2 datos YA ESTABLECIDOS en la clase COMPARADOR
 */

public class Test {

    public static void main(String[] args) {

        Scanner pudin = new Scanner(System.in);
        int identifier, edad, ciclo=0, opc;
        String nombre, carnet, nombreAlm;
        double precio;
        Comprador traermetodos = new Comprador();

        while (ciclo == 0){

            System.out.println("\n\n\n1) Validar precio del producto\n2) Validar edad del alumno\n3) Salir");
            opc = pudin.nextInt();

            while (opc < 1 || opc > 3){
                System.out.println("\n\n********************\nIngresar una opcino valida\n********************\n\n");
                System.out.println("1) Validar precio del producto\n2) Validar edad del alumno\n3) Salir");
                opc = pudin.nextInt();
            }
            switch (opc){
                case 1:
                    System.out.print("Ingrese el codigo que identifica al producto: "); identifier = pudin.nextInt();
                    System.out.print("Ingrese el nombre del producto: "); nombre = pudin.nextLine();
                    pudin.nextLine();
                    System.out.print("Ingrese el precio del producto: Q"); precio = pudin.nextDouble();
                    Producto delivery = new Producto(identifier, nombre, precio);


                    if (traermetodos.igualQueA(delivery))
                        System.out.println("\n\n****************************\nEl valor ingresado es igual a Q9.99\n****************************");
                    if (traermetodos.mayorQue(delivery))
                        System.out.println("\n\n****************************\nEl valor ingresado es mayor a Q9.99\n****************************");
                    if (traermetodos.menorQue(delivery))
                        System.out.println("\n\n****************************\nEl valor ingresado es menor a Q9.99\n****************************");
                    if (traermetodos.menorigualQue(delivery))
                        System.out.println("\n\n****************************\nEl valor ingresado es menor o igual que Q9.99\n****************************");
                    if (traermetodos.mayorigualQue(delivery))
                        System.out.println("\n\n****************************\nEl valor ingresado es mayor o igual que Q9.99\n****************************");
                break;
                case 2:
                    System.out.print("Ingrese el nombre: "); nombreAlm = pudin.nextLine(); pudin.nextLine();
                    System.out.print("Igrese el carnet: "); carnet = pudin.nextLine();
                    System.out.print("Ingrese la edad del alumno: "); edad = pudin.nextInt();
                    Alumno delivery2 = new Alumno(nombreAlm, carnet, edad  );

                    if (traermetodos.igualQueAlumno(delivery2))
                        System.out.println("\n\n********************************************************\nLa edad ingresada es igual a la edad establecida (25 Años)\n********************************************************");
                    if (traermetodos.mayorQueAlumno(delivery2))
                        System.out.println("\n\n********************************************************\nLa edad ingresada es mayor a la edad establecida (25 Años)\n********************************************************");
                    if (traermetodos.mayorigualQueAlumno(delivery2))
                        System.out.println("\n\n********************************************************\nLa edad ingresada es mayor o igual a la edad establecida (25 Años)\n********************************************************");
                    if (traermetodos.menorQueAlumno(delivery2))
                        System.out.println("\n\n********************************************************\nLa edad ingresada es menor a la edad establecida (25 Años)\n********************************************************");
                    if (traermetodos.menoroigualQueAlumno(delivery2))
                        System.out.println("\n\n********************************************************\nLa edad ingresada es menor o igual a la edad establecida (25 Años)\n********************************************************");
                break;
                case 3:
                    ciclo = 1;
                break;
            }//Fin Switch Principal
        }//Fin While
    }
}
