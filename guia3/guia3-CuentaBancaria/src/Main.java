import modelo.Cliente;
import modelo.Cuenta;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Scanner scan;

    public static void main(String[] args)
    {
        scan = new Scanner(System.in);
        ArrayList<String> operaciones = new ArrayList<>();
        int opcion;

        Cliente cliente = new Cliente("a2315adF", "Juan", "Perez", 'm');
        Cuenta cuenta = new Cuenta("F25s4", cliente,10000, 2000);

        System.out.println("\n"+cuenta);

        for(int i=0; i<=10; i++)
        {
            menu();
            opcion = scan.nextInt();

            switch (opcion)
            {
                case 1:
                    operaciones.add(extraerDeCuenta(cuenta));
                    break;

                case 2:
                    operaciones.add(depositarEnCuenta(cuenta));
                    break;

                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }

        System.out.println("\n ---------------------------");
        System.out.println("|  Historial de operaciones |");
        System.out.println(" ---------------------------");
        for (String operacion : operaciones)
        {
            System.out.println(operacion);
        }

        scan.close();
    }

    public static void menu()
    {
        System.out.println("\n -----------------------");
        System.out.println("|         MENU          |");
        System.out.println(" -----------------------");
        System.out.println("1. Extraer");
        System.out.println("2. Depositar");
    }

    public static String extraerDeCuenta(Cuenta cuenta)
    {
        String extraccion = "El cliente " + cuenta.getCliente().obtenerNombre();
        float monto;

        System.out.println("Ingrese el monto a extraer: ");
        monto = scan.nextFloat();

        if(cuenta.extraer(monto))
        {
            extraccion+=", retiro $" + monto;
            System.out.println("\nExtraccion exitosa");
        }
        else
        {
            extraccion+=", intento retirar $"+monto + " | fondos insuficientes";
            System.out.println("\nFondos insuficientes");
        }

        return extraccion;
    }

    public static String depositarEnCuenta(Cuenta cuenta)
    {
        String depositar = "El cliente " + cuenta.getCliente().obtenerNombre();
        float monto;

        System.out.println("Ingrese el monto a depositar: ");
        monto = scan.nextFloat();

        depositar+=", deposito $"+monto;

        return depositar;
    }
}