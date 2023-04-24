import modelo.Employee;

public class Main {
    public static void main(String[] args)
    {
        Employee empleado1 = new Employee(23456345, "Carlos", "Gutierrez", 25000);
        Employee empleado2 = new Employee(34234123, "Ana", "Sanchez", 27500);

        System.out.println("Mostrando empleados: ");
        System.out.println("-------------------");
        System.out.println(empleado1.getDescription());
        System.out.println("-------------------------------------------");
        System.out.println(empleado2.getDescription());
        System.out.println("-------------------------------------------");

        empleado1.increaseSalary(15);
        System.out.println("Salario anual de " + empleado1.getFullName() + " : $" + empleado1.annualSalary());
    }
}