import modelo.Persona;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner scan;
    public static void main(String[] args)
    {
        scan = new Scanner(System.in);

        //Pide por teclado el nombre, la edad, sexo, peso y altura.
        String nombre;
        int edad;
        char sexo;
        float peso, altura;

        System.out.println(" -----------------------------");
        System.out.println("| Cargando datos de persona 1 |");
        System.out.println(" -----------------------------");
        System.out.println("Ingrese un nombre: ");
        nombre = scan.nextLine();

        edad = ingresarEdad();

        scan.nextLine();
        sexo = ingresarSexo();

        peso = ingresarPeso();

        altura = ingresarAltura();

        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona();

        //agrego peso y altura a la persona 2
        System.out.println(" -----------------------------");
        System.out.println("| Cargando datos de persona 2 |");
        System.out.println(" -----------------------------");
        peso = ingresarPeso();
        altura = ingresarAltura();

        persona2.setPeso(peso);
        persona2.setAltura(altura);

        //agrego datos a la persona3
        System.out.println(" -----------------------------");
        System.out.println("| Cargando datos de persona 3 |");
        System.out.println(" -----------------------------");
        scan.nextLine();
        System.out.println("Ingrese un nombre: ");
        nombre = scan.nextLine();

        edad = ingresarEdad();

        scan.nextLine();
        sexo = ingresarSexo();

        peso = ingresarPeso();

        altura = ingresarAltura();

        persona3.setNombre(nombre);
        persona3.setEdad(edad);
        persona3.setSexo(sexo);
        persona3.setPeso(peso);
        persona3.setAltura(altura);

        //Para cada objeto, deberá comprobar si está en su peso ideal, tiene sobrepeso o
        // por debajo de su peso ideal con un mensaje.
        System.out.println("\nCalculo IMC de la persona 1:");
        comprobarIMC(persona1);

        System.out.println("\nCalculo IMC de la persona 2:");
        comprobarIMC(persona2);

        System.out.println("\nCalculo IMC de la persona 3:");
        comprobarIMC(persona3);

        //Indicar para cada objeto si es mayor de edad.
        System.out.println("\nPersona 1:");
        esMayorDeEdad(persona1);
        System.out.println("\nPersona 2:");
        esMayorDeEdad(persona2);
        System.out.println("\nPersona 3:");
        esMayorDeEdad(persona3);

        System.out.println(" -----------------------");
        System.out.println("| Mostrando a persona 1 |");
        System.out.println(" -----------------------");
        System.out.println(persona1);

        System.out.println("\n -----------------------");
        System.out.println("| Mostrando a persona 2 |");
        System.out.println(" -----------------------");
        System.out.println(persona2);

        System.out.println("\n -----------------------");
        System.out.println("| Mostrando a persona 3 |");
        System.out.println(" -----------------------");
        System.out.println(persona3);

        scan.close();
    }

    public static int ingresarEdad()
    {
        int edad;
        do
        {
            System.out.println("Ingrese la edad: ");
            edad = scan.nextInt();

            if(edad < 0)
                System.out.println("ERROR: la edad no puede ser menor a 0");

        }while(edad < 0);
        return edad;
    }

    public static char ingresarSexo()
    {
        String sexo;
        do
        {
            System.out.println("Ingrese el sexo: (H/M)");
            sexo = scan.nextLine();

            if((sexo.charAt(0) != 'H') && (sexo.charAt(0) != 'M'))
                System.out.println("ERROR: opcion invalida");

        }while ((sexo.charAt(0) != 'H') && (sexo.charAt(0) != 'M'));
        return sexo.charAt(0);
    }

    public static float ingresarPeso()
    {
        float peso;
        do
        {
            System.out.println("Ingrese la peso: ");
            peso = scan.nextFloat();

            if(peso < 0)
                System.out.println("ERROR: el peso no puede ser menor a 0");

        }while(peso < 0);
        return peso;
    }

    public static float ingresarAltura()
    {
        float altura;
        do
        {
            System.out.println("Ingrese la altura: ");
            altura = scan.nextFloat();

            if(altura < 0)
                System.out.println("ERROR: la altura no puede ser menor a 0");

        }while(altura < 0);
        return altura;
    }

    public static void comprobarIMC(Persona persona)
    {
        int imc = persona.calcularIMC();

        if(imc == -1)
            System.out.println("Está por debajo de su peso ideal");
        else if(imc == 0)
            System.out.println("Está en su peso ideal");
        else
            System.out.println("Tiene sobrepeso");
    }

    public static void esMayorDeEdad(Persona persona)
    {
        if(persona.esMayorDeEdad())
            System.out.println("Es mayor de edad");
        else
            System.out.println("No se mayor de edad");
    }
}