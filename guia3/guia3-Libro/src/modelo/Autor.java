package modelo;

public class Autor {
    private String nombre;
    private String apellido;
    private String email;
    private char genero;

    public Autor(String nombre, String apellido, String email, char genero)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.genero = genero;
    }

    public String getNombre()
    {
        return nombre;
    }

    public String getApellido()
    {
        return apellido;
    }

    public String getEmail()
    {
        return email;
    }

    public char getGenero()
    {
        return genero;
    }

    @Override
    public String toString() {
        return  "Autor: " + "\n Nombre='" + nombre +
                "\n Apellido=" + apellido +
                "\n email=" + email +
                "\n Genero=" + genero;
    }
}
