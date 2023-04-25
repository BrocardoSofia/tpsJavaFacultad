package modelo;

public abstract class Empleado
{
    //----------------------------------------------------------------------------------- ATRIBUTOS
    private String DNI;
    private String nombre;
    private String apellido;
    private int añoDeIngreso;

    //----------------------------------------------------------------------------------- METODOS
    public Empleado(String DNI, String nombre, String apellido, int añoDeIngreso)
    {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.añoDeIngreso = añoDeIngreso;
    }

    public Empleado()
    {
        DNI = "";
        nombre = "";
        apellido = "";
        añoDeIngreso = 0;
    }

    public String imprimir()
    {
        return  "Nombre: .................. " + nombre +
                "\nApellido: ................ " + apellido +
                "\nDNI: ..................... " + DNI +
                "\nAño de ingreso: .......... " + añoDeIngreso +
                "\nSalario: ................. $" + obtenerSalario();
    }

    public void setDNI(String DNI)
    {
        this.DNI = DNI;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }

    public void setAñoDeIngreso(int añoDeIngreso)
    {
        this.añoDeIngreso = añoDeIngreso;
    }

    public int getAñoDeIngreso()
    {
        return añoDeIngreso;
    }

    public String getDNI()
    {
        return DNI;
    }

    public String getNombre()
    {
        return nombre;
    }

    public String getApellido()
    {
        return apellido;
    }

    public abstract float obtenerSalario();
}
