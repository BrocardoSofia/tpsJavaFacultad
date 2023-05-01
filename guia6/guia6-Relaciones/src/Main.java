import modelo.Numero;

import java.util.Scanner;

public class Main {
    public static Scanner scan;

    public static void main(String[] args)
    {
        Numero num1;
        Numero num2;
        int aux1, aux2;
        scan = new Scanner(System.in);

        System.out.println("Ingrese el primer Numero: ");
        aux1 = scan.nextInt();
        num1 = new Numero(aux1);

        System.out.println("Ingrese el segundo Numero: ");
        aux2 = scan.nextInt();
        num2 = new Numero(aux2);

        if(num1.esMayor(num2))
            System.out.println("" + num1.getNumero() + " es mayor a " + num2.getNumero());
        else
            System.out.println("" + num2.getNumero() + " es mayor a " + num1.getNumero());

        if(num1.esMenor(num2))
            System.out.println("" + num1.getNumero() + " es menor a " + num2.getNumero());
        else
            System.out.println("" + num2.getNumero() + " es menor a " + num1.getNumero());

        if(num1.esIgual(num2))
            System.out.println("" + num1.getNumero() + " y " + num2.getNumero() + " son iguales");
        else
            System.out.println("" + num1.getNumero() + " y " + num2.getNumero() + " son diferentes");

        scan.close();
    }
}