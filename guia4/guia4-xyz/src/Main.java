import modelo.EAsalariado;
import modelo.EComision;
import modelo.Empleado;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner scan;

    public static void main(String[] args)
    {
        scan = new Scanner(System.in);
        ArrayList<Empleado> empleados = new ArrayList<>();
        String seguir = "s";
        int opcion;
        float monto1 = (float)8.10;
        float monto2 = (float)7.9;

        //cargo los primeros como dice el ejercicio
        EAsalariado e1 = new EAsalariado("569587A", "Javier", "Gómez",
                2008, 1225);
        EComision e2 = new EComision("695235B", "Eva", "Nieto",
                2010, 179, monto1);
        EComision e3 = new EComision();
        e3.setNombre("José");
        e3.setApellido("Ruiz");
        e3.setDNI("741258C");
        e3.setAñoDeIngreso(2012);
        e3.setClientesCaptados(81);
        e3.setMontoXclienteCaptado(monto2);
        EAsalariado e4 = new EAsalariado();
        e4.setNombre("María");
        e4.setApellido("Núñez");
        e4.setDNI("896325D");
        e4.setAñoDeIngreso(2013);
        e4.setSalarioBase(1155);

        empleados.add(e1);
        empleados.add(e2);
        empleados.add(e3);
        empleados.add(e4);

        //prueba para sistema de carga manual
        do {
            System.out.println(" --------------------");
            System.out.println("| CARGANDO EMPLEADOS |");
            System.out.println(" --------------------");
            System.out.println("1. Personal con salario fijo");
            System.out.println("2. Personal a comisión");

            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println(" ------------------------------");
                    System.out.println("| CARGANDO EMPLEADO ASALARIADO |");
                    System.out.println(" ------------------------------");
                    empleados.add(cargarEmpleado(true));
                    break;
                case 2:
                    System.out.println(" --------------------------------");
                    System.out.println("| CARGANDO EMPLEADO POR COMISION |");
                    System.out.println(" --------------------------------");
                    empleados.add(cargarEmpleado(false));
                    break;
            }
            scan.nextLine();

            System.out.println("Seguir cargando empleados? (s/n)");
            seguir = scan.nextLine();
        }while(seguir.charAt(0) != 'n');

        sueldoMayor(empleados);
        mostrarTodos(empleados);

        scan.close();
    }

    public static void mostrarTodos(ArrayList<Empleado> empleados)
    {
        System.out.println("\nMOSTRANDO A TODOS LOS EMPLEADOS ");
        for(Empleado e : empleados)
        {
            System.out.println(e.imprimir());
            System.out.println("\n-------------------------------------------------\n");
        }
    }

    public static void sueldoMayor(ArrayList<Empleado> empleados)
    {
        float sueldoMayor;
        Empleado eConMayorSueldo;

        if(empleados.isEmpty())
            System.out.println("No hay empleados cargados");
        else
        {
            sueldoMayor = empleados.get(0).obtenerSalario();
            eConMayorSueldo = empleados.get(0);
            for(Empleado e : empleados)
            {
                if(e.obtenerSalario() > sueldoMayor)
                {
                    sueldoMayor = e.obtenerSalario();
                    eConMayorSueldo = e;
                }
            }

            System.out.println("Empleado con mayor sueldo: ");
            System.out.println(eConMayorSueldo.imprimir());
            System.out.println("\n-------------------------------------------------\n");
        }
    }

    public static Empleado cargarEmpleado(boolean empleadoSalarioFijo)
    {
        int añoDeIngreso;
        String nombre, apellido, DNI;
        Empleado empleado;

        scan.nextLine();

        System.out.println("Ingrese DNI: ");
        DNI = scan.nextLine();

        System.out.println("Ingrese nombre: ");
        nombre = scan.nextLine();

        System.out.println("Ingrese apellido: ");
        apellido = scan.nextLine();

        System.out.println("Ingrese año de ingreso: ");
        añoDeIngreso = scan.nextInt();

        if(empleadoSalarioFijo)
        {
            float salarioBase;

            System.out.println("Ingrese el salario Base: ");
            salarioBase = scan.nextFloat();

            empleado = new EAsalariado(DNI, nombre, apellido, añoDeIngreso, salarioBase);
        }
        else
        {
            int clientesCaptados;
            float montoXclienteCaptado;

            System.out.println("Ingrese la cantidad de clientes captados: ");
            clientesCaptados = scan.nextInt();
            System.out.println("Ingrese el monto por cliente: ");
            montoXclienteCaptado = scan.nextFloat();

            empleado = new EComision(DNI, nombre, apellido, añoDeIngreso, clientesCaptados, montoXclienteCaptado);
        }

        return empleado;
    }
}