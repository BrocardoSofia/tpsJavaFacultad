package modelo;

public class Libro {
    private String titulo;
    private float precio;
    private int stock;
    private Autor autor;

    public Libro(String titulo, float precio, int stock, Autor autor)
    {
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro:"  +
                "\n Titulo=" + titulo +
                "\n Precio=" + precio +
                "\n Stock=" + stock +
                "\n" + autor.toString();
    }

    public void setPrecio(float precio)
    {
        this.precio = precio;
    }

    public float getPrecio()
    {
        return precio;
    }

    public void setStock(int stock)
    {
        this.stock = stock;
    }

    public  int getStock()
    {
        return stock;
    }

    public String mostrarAutor()
    {
        return autor.toString();
    }

    public String mensajeInfoLibro()
    {
        return "El libro, "+ titulo +" de "+ autor.getNombre() + " " + autor.getApellido() +
                ". Se vende a "+ precio +" pesos.";
    }
}
