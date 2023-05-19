package modelo;

public class Elemento
{
    private String titulo;
    private boolean prestado;
    private String genero;

    private final boolean prestadoDefault = false;

    public Elemento()
    {
        this.titulo = "";
        this.genero = "";
        this.prestado = prestadoDefault;
    }

    public Elemento(String titulo)
    {
        this.genero = "";
        this.titulo = titulo;
        this.prestado = prestadoDefault;
    }
    public Elemento(String titulo, String genero)
    {
        this.genero = genero;
        this.titulo = titulo;
        this.prestado = prestadoDefault;
    }

    public String getTitulo()
    {
        return titulo;
    }
    public String getGenero()
    {
        return genero;
    }

    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }
    public void setGenero(String genero)
    {
        this.genero = genero;
    }

    //isEntregado(): devuelve el estado del atributo prestado
    public boolean isEntregado()
    {
        return prestado;
    }

    public String toString()
    {
        String estaEntregado = "No";

        if(prestado)
            estaEntregado = "Si";

        return  "Titulo: .................. " + getTitulo() + "\n" +
                "Prestado: ................ " + estaEntregado + "\n" +
                "Genero: .................. " + getGenero() + "\n";
    }

    //entregar(): cambia el atributo prestado a true
    public boolean entregar()
    {
        boolean seEntrego = false;//si ya esta prestado no se puede volver a prestar

        if(!prestado)
        {
            prestado = true;
            seEntrego = true;
        }
        return seEntrego;
    }

    //devolver(): cambia el atributo prestado a false.
    public boolean devolver()
    {
        boolean seDevolvio = false;//si no estaba prestado no se puede devolver
        if(prestado)
        {
            prestado = false;
            seDevolvio = true;
        }

        return seDevolvio;
    }
}
