package modelo;

public class Employee
{
    private int dni;
    private String name;
    private String surname;
    private double salary;

    public  Employee(int dni, String name, String surname, double salary)
    {
        this.dni = dni;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public float annualSalary()
    {
        return (float)salary*12;
    }

    public void increaseSalary(float percentage)
    {
        percentage /=100;
        salary+=salary*percentage;
    }

    public String getFullName()
    {
        return name + " " + surname;
    }
    public String getDescription()
    {
        return "Empleado: " +
               "\n dni: .......... " + dni +
               "\n Nombre: ....... " + name +
               "\n Apellido: ..... " + surname +
               "\n Salario: ...... $" + salary;
    }
}
