import modelo.ItemVenta;

import java.util.Scanner;

public class Main {
    public static Scanner scan;
    public static void main(String[] args)
    {
        ItemVenta item;
        String id, descripcion;
        int cantidad;
        float precioUnitario;
        scan = new Scanner(System.in);

        System.out.println("Ingrese el id: ");
        id = scan.nextLine();

        System.out.println("Ingrese la descripcion del item: ");
        descripcion = scan.nextLine();

        System.out.println("Ingrese la cantidad: ");
        cantidad = scan.nextInt();

        System.out.println("Ingrese el precio unitario: ");
        precioUnitario = scan.nextFloat();

        item = new ItemVenta(id, descripcion, cantidad, precioUnitario);
        System.out.println(item);

        scan.close();
    }
}