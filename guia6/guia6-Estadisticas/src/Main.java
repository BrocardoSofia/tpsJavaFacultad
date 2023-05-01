import modelo.ArrayReales;

import java.util.Scanner;

public class Main {
    public static Scanner scan;

    public static void main(String[] args)
    {
        ArrayReales arreglo = new ArrayReales();
        double numero;
        String opcion;
        scan = new Scanner(System.in);

        do
        {
            System.out.println("Ingrese un numero real: ");
            numero = scan.nextDouble();

            arreglo.agregarALista(numero);

            scan.nextLine();

            System.out.println("Desea seguir cargando numeros? (s/n)");
            opcion = scan.nextLine();
        }while (opcion.charAt(0) != 'n');

        System.out.println(" ----------------- ");
        System.out.println("|     ARREGLO     |");
        System.out.println(" ----------------- ");
        System.out.println(arreglo.imprimir());
        System.out.println("Minimo: ............ " + arreglo.minimo());
        System.out.println("Maximo: ............ " + arreglo.maximo());
        System.out.println("Sumatoria: ......... " + arreglo.sumatorio());

        scan.close();
    }
}