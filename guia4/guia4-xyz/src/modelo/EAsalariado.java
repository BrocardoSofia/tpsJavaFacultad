package modelo;

import java.time.LocalDate;

public class EAsalariado extends Empleado
{
    //----------------------------------------------------------------------------------- ATRIBUTOS
    private float salarioBase;

    //----------------------------------------------------------------------------------- METODOS
    public EAsalariado(String DNI, String nombre, String apellido, int añoDeIngreso,
                       float salarioBase)
    {
        super(DNI, nombre, apellido, añoDeIngreso);
        this.salarioBase = salarioBase;
    }

    public EAsalariado()
    {
        super();
        salarioBase = 0;
    }

    public void setSalarioBase(float salarioBase)
    {
        this.salarioBase = salarioBase;
    }

    @Override
    public float obtenerSalario()
    {
        float salario = salarioBase;
        LocalDate tiempoActual = LocalDate.now();
        int añosTrabajando = tiempoActual.getDayOfYear() - getAñoDeIngreso();

        //porcentaje adicional en función del número de años
        // menos de dos años salario base

        if((añosTrabajando>=2) && (añosTrabajando<=3)) //------------- de 2 a 3 años: 5% más
            salario+=(salarioBase * 0.05);
        else if((añosTrabajando>=4) && (añosTrabajando<=7)) //-------- de 4a 7 años: 10% más
            salario+=(salarioBase * 0.1);
        else if((añosTrabajando>=8) && (añosTrabajando<=15)) //------- de 8 a 15 años: 15% más
            salario+=(salarioBase * 0.15);
        else if(añosTrabajando > 15)
            salario+=(salarioBase * 0.2); //-------------------------- más de 15 años: 20% más

        return salario;
    }
}
