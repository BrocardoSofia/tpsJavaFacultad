package modelo;

public class Cliente {
    private String id;
    private String nombre;
    private String apellido;
    private char genero;

    public Cliente(String id, String nombre, String apellido, char genero)
    {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Cliente:" +
                "\n  Id ........... " + id +
                "\n  Nombre ....... " + nombre +
                "\n  Apellido ..... " + apellido +
                "\n  Genero ....... " + genero;
    }

    public String obtenerNombre()
    {
        return nombre + " " + apellido;
    }
}
