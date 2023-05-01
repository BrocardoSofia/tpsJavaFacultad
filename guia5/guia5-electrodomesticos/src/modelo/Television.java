package modelo;

public class Television extends Electrodomestico
{
    //----- CONSTANTES
    private final double resolucionPorDefecto = 20;
    private final boolean sintonizadorTDTPorDefecto = false;
    //----------------------------------------------------------------------- ATRIBUTOS
    private double resolucion;
    private boolean sintonizadorTDT;

    //----------------------------------------------------------------------- METODOS
    public Television()
    {
        super();
        resolucion = resolucionPorDefecto;
        sintonizadorTDT = sintonizadorTDTPorDefecto;
    }

    public Television(double precioBase, double peso)
    {
        super(precioBase, peso);
        resolucion = resolucionPorDefecto;
        sintonizadorTDT = sintonizadorTDTPorDefecto;
    }

    public Television(double precioBase, double peso, String color, char consumoEnergetico,
                      double resolucion, boolean sintonizadorTDT)
    {
        super(precioBase, peso, color, consumoEnergetico);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public double getResolucion()
    {
        return resolucion;
    }

    public boolean getSintonizadorTDT()
    {
        return sintonizadorTDT;
    }

    public String toString()
    {
        String sintonizador;

        if(sintonizadorTDT)
            sintonizador = "Tiene";
        else
            sintonizador = "No tiene";

        return "Television:\n"+super.toString() +
                "\nResolucion: ............... " + resolucion + " pulgadas" +
                "\nSintonizador TDT: ......... " + sintonizador +
                "\nPrecio Final: ............. $" + precioFinal();
    }

    public double precioFinal()
    {
        double precio = super.precioFinal();

        if(resolucion > 40)
            precio += (precio*0.3);

        if(sintonizadorTDT)
            precio += 50;

        return precio;
    }
}
