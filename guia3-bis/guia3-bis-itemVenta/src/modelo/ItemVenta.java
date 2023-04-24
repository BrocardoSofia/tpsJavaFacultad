package modelo;

public class ItemVenta
{
    //--------------------------------------------------------- ATRIBUTOS
    private String id;
    private String descripcion;
    private int cantidad;
    private float precioUnitario;

    //--------------------------------------------------------- METODOS
    public ItemVenta(String id, String descripcion, int cantidad, float precioUnitario)
    {
        this.id = id;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public float precioTotal()
    {
        return (cantidad * precioUnitario);
    }

    @Override
    public String toString() {
        return  "ID: .................... " + id +
                "\nDescripcion: ........... " + descripcion +
                "\nCantidad: .............. " + cantidad + " u " +
                "\nPrecio Unitario: ....... $" + precioUnitario +
                "\nPrecio Total: .......... $" + precioTotal();
    }
}
