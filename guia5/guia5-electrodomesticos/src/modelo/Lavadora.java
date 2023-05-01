package modelo;

public class Lavadora extends Electrodomestico
{
    //----- CONSTANTE
    private final double cargaPorDefecto = 5;
    //----------------------------------------------------------------------- ATRIBUTOS
    private double carga;

    //----------------------------------------------------------------------- METODOS
    public Lavadora()
    {
        super();
        carga = cargaPorDefecto;
    }

    public Lavadora(double precioBase, double peso)
    {
        super(precioBase, peso);
        carga = cargaPorDefecto;
    }

    public Lavadora(double precioBase, double peso, String color, char consumoEnergetico, double carga)
    {
        super(precioBase, peso, color, consumoEnergetico);
        this.carga = carga;
    }

    public double getCarga()
    {
        return carga;
    }

    public String toString()
    {
        return "Lavadora:\n"+super.toString() + "\nCarga: .................... " + carga +
                "\nPrecio Final: ............. $" + precioFinal();
    }

    public double precioFinal()
    {
        double precio = super.precioFinal();

        if(carga > 30)
            precio += 50;

        return precio;
    }
}
