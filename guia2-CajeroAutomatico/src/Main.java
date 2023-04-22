import modelo.Cuenta;

import java.util.Scanner;

public class Main {
    public static Scanner scan;
    public static Cuenta cuenta;
    public static void main(String[] args)
    {
        cuenta = null;
        int opcion;
        scan = new Scanner(System.in);

        do {
            mostrarMenuPrincipal();
            opcion = scan.nextInt();

            switch (opcion)
            {
                case 1:
                    cuenta = new Cuenta();
                    break;

                case 2:
                    cargarCuenta();
                    break;

                case 3:
                    agregarSaldo();
                    break;

                case 4:
                    retirarDinero();
                    break;

                case 5:
                    verCuenta();
                    break;

                case 6:
                    System.out.println("Adios");
                    break;
            }

        }while (opcion != 6);
        scan.close();
    }

    public static void mostrarMenuPrincipal()
    {
        System.out.println(" ----------------------------");
        System.out.println("|        MENU CAJERO         |");
        System.out.println(" ----------------------------");
        System.out.println("1. Crear cuenta vacía");
        System.out.println("2. Crear cuenta saldo inicial");
        System.out.println("3. Ingresar dinero");
        System.out.println("4. Sacar dinero");
        System.out.println("5. Ver datos de cuenta");
        System.out.println("6. Salir");
    }

    public static void cargarCuenta()
    {
        float saldo;
        System.out.println("Ingrese el saldo inicial: ");
        saldo = scan.nextFloat();

        cuenta = new Cuenta(saldo);
    }

    public static void agregarSaldo()
    {
        float monto;

        if(cuenta != null)
        {
            System.out.println("Ingrese monto a depositar: ");
            monto = scan.nextFloat();

            cuenta.ingresar(monto);
        }
        else
        {
            System.out.println("ERROR: No hay ninguna cuenta creada");
        }
    }

    public static void retirarDinero()
    {
        float monto;

        if(cuenta != null)
        {
            System.out.println("Ingrese monto a retirar: ");
            monto = scan.nextFloat();

            if(monto <= cuenta.getSaldo())
            {
                if(cuenta.extraer(monto))
                    System.out.println("Extraccion exitosa");
                else
                    System.out.println("ERROR: algo salio mal");

            }
            else
            {
                System.out.println("ERROR: saldo insuficiente");
            }
        }
        else
        {
            System.out.println("ERROR: No hay ninguna cuenta creada");
        }

    }

    public static void verCuenta()
    {
        if(cuenta != null)
        {
            System.out.println(cuenta);
        }
        else
        {
            System.out.println("ERROR: no existe ninguna cuenta");
        }
    }
}