import modelo.Hora;

import java.util.Scanner;

public class Main {
    public static Scanner scan;
    public static void main(String[] args)
    {
        Hora _hora;
        int hora, minuto, segundo, opcion;
        scan = new Scanner(System.in);

        System.out.println("Ingrese la hora: ");
        hora = scan.nextInt();

        System.out.println("Ingrese el minuto: ");
        minuto = scan.nextInt();

        System.out.println("Ingrese el segundo: ");
        segundo = scan.nextInt();

        _hora = new Hora(hora, minuto, segundo);

        do {
            System.out.println(_hora.toString());
            System.out.println("\n1. Incrementar un segundo: ");
            System.out.println("2. Decrementar un segundo: ");
            System.out.println("3. Salir");

            opcion = scan.nextInt();;

            switch (opcion)
            {
                case 1:
                    _hora.avanzarUnSegundo();
                    break;
                case 2:
                    _hora.retrocederUnSegundo();
                    break;
                case 3:
                    System.out.println("Adios!");
                    break;
            }

        }while(opcion != 3);

        scan.close();
    }
}