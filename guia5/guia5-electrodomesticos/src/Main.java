import modelo.Electrodomestico;
import modelo.Lavadora;
import modelo.Television;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner scan;

    public static void main(String[] args)
    {
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>();
        scan = new Scanner(System.in);
        double precioFinalTelevisores = 0;
        double precioFinalLavadoras = 0;
        double precioFinalElectrodomesticos = 0;

        for(int i=0; i<10; i++)
        {
            System.out.println(" ---------------------------- ");
            System.out.println("| CARGANDO ELECTRODOMESTICOS |");
            System.out.println(" ---------------------------- ");

            electrodomesticos.add(cargarElectrodomestico());
        }

        System.out.println(" -----------");
        System.out.println("| LAVADORAS |");
        System.out.println(" -----------");
        for(Electrodomestico e : electrodomesticos)
        {
            if (e instanceof Lavadora)
            {
                System.out.println(e.toString());
                System.out.println("\n--------------------------------\n");
                precioFinalLavadoras += e.precioFinal();
            }
        }
        System.out.println("\nPrecio Final Lavadoras: ...................................... $"
                + precioFinalLavadoras);

        System.out.println(" -------------");
        System.out.println("| TELEVISORES |");
        System.out.println(" -------------");
        for(Electrodomestico e : electrodomesticos)
        {
            if (e instanceof Television)
            {
                System.out.println(e.toString());
                System.out.println("\n--------------------------------\n");
                precioFinalTelevisores += e.precioFinal();
            }
        }
        System.out.println("\nPrecio Final Televisores: .................................... $"
                + precioFinalTelevisores);

        precioFinalElectrodomesticos = precioFinalLavadoras + precioFinalTelevisores;
        System.out.println("\nPrecio Final Electrodomesticos: .............................. $"
                + precioFinalElectrodomesticos);

        scan.close();
    }

    public static String menuElegirElectrodomestico()
    {
        return "1. Lavadora\n2. Television";
    }

    public static Electrodomestico cargarElectrodomestico()
    {
        Electrodomestico electrodomestico;
        double precioBase, peso;
        String color, consumoEnergetico;
        int opcion;

        do
        {
            System.out.println(menuElegirElectrodomestico());
            opcion = scan.nextInt();
        }while ((opcion!=1) && (opcion!=2));

        System.out.println("Ingrese el precio base: ");
        precioBase = scan.nextDouble();

        System.out.println("Ingrese el peso: (en kg)");
        peso = scan.nextDouble();

        scan.nextLine();

        System.out.println("Ingrese el color: ");
        color = scan.nextLine();

        System.out.println("Ingrese el consumo energetico (A-B-C-D-E-F)");
        consumoEnergetico = scan.nextLine();

        if (opcion == 1)
        {
            double carga;
            System.out.println("Ingrese la carga de la lavadora: ");
            carga = scan.nextDouble();

            electrodomestico = new Lavadora(precioBase, peso, color, consumoEnergetico.charAt(0), carga);
        }
        else
        {
            double resolucion;
            int sintonizadorOpcion;
            boolean sintonizadorTDT;
            System.out.println("Ingrese las pulgadas del televisor: ");
            resolucion = scan.nextDouble();
            System.out.println("Ingrese 1 si tiene un sintonizador TDT: ");
            sintonizadorOpcion = scan.nextInt();

            if(sintonizadorOpcion == 1)
                sintonizadorTDT = true;
            else
                sintonizadorTDT = false;

            electrodomestico = new Television(precioBase, peso, color, consumoEnergetico.charAt(0),
                    resolucion, sintonizadorTDT);
        }


        return electrodomestico;
    }
}