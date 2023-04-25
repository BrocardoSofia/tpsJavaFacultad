import modelo.Password;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner scan;
    public static void main(String[] args)
    {
        scan = new Scanner(System.in);
        ArrayList<Password> contraseñas = new ArrayList<>();
        ArrayList<Boolean> sonFuertes = new ArrayList<>();
        int cantidad, longitud;

        System.out.println("Ingrese la cantidad de contraseñas a generar: ");
        cantidad = scan.nextInt();

        //Indica también por teclado la longitud de los Passwords (antes de bucle).
        System.out.println("Indique la longitud de la contraseña: ");
        longitud = scan.nextInt();

        //Crea un bucle que cree un objeto para cada posición del array
        for(int i=0; i<cantidad; i++)
        {
            Password contraseña = new Password(longitud);
            contraseñas.add(contraseña);

            //Crea otro array de booleanos donde se almacene si el password del array
            // de Password es o no fuerte (usa el bucle anterior).
            sonFuertes.add(contraseña.esFuerte());

            //Al final, muestra la contraseña y si es o no fuerte (usa el bucle anterior)
            System.out.println("Contraseña: .......... " + contraseñas.get(i).getContraseña());
            System.out.println("Longitud: ............ " + contraseñas.get(i).getLongitud());

            if(sonFuertes.get(i))
                System.out.println("Es fuerte: ........... Si");
            else
                System.out.println("Es fuerte: ........... No");

            System.out.println("\n--------------------------------------------------------\n");
        }

        scan.close();
    }
}