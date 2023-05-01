package modelo;

public abstract class Electrodomestico
{
    //----- CONSTANTES
    private final String colorPorDefecto = "blanco";
    private final char consumoEnergeticoPorDefecto = 'F';
    private final double precioBasePorDefecto = 100;
    private final double pesoPorDefecto = 5;
    //----------------------------------------------------------------------- ATRIBUTOS
    private double precioBase;
    private String color;
    private char consumoEnergetico;
    private double peso;

    //----------------------------------------------------------------------- METODOS
    public Electrodomestico()
    {
        this.precioBase = precioBasePorDefecto;
        this.peso = pesoPorDefecto;
        this.color = colorPorDefecto;
        this.consumoEnergetico = consumoEnergeticoPorDefecto;
    }

    public Electrodomestico(double precioBase, double peso)
    {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = colorPorDefecto;
        this.consumoEnergetico = consumoEnergeticoPorDefecto;
    }

    public Electrodomestico(double precioBase, double peso, String color, char consumoEnergetico)
    {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
    }

    public double getPrecioBase()
    {
        return precioBase;
    }

    public double getPeso()
    {
        return peso;
    }

    public String getColor()
    {
        return color;
    }

    public char getConsumoEnergetico()
    {
        return consumoEnergetico;
    }


    public String toString()
    {
        return  "Precio Base: .............. $" + precioBase +
                "\nPeso: ..................... " + peso + "kg" +
                "\nColor: .................... " + color +
                "\nConsumo Energetico: ....... " + consumoEnergetico;
    }
    private char comprobarConsumoEnergetico(char letra)
    {
        char retornarLetra = consumoEnergeticoPorDefecto;
        int control = letra;

        //compruebo con el caracter en ascii en minuscula como en mayuscula de la A a la F
        if(((control >= 65) && (control <= 70)) || ((control >= 94) && (control <= 102)))
            retornarLetra = letra;

        return retornarLetra;
    }

    private String comprobarColor(String color)
    {
        String retornarColor =  colorPorDefecto;

        if((color.equalsIgnoreCase("blanco")) || (color.equalsIgnoreCase("negro")) ||
                (color.equalsIgnoreCase("rojo")) || (color.equalsIgnoreCase("azul")) ||
                (color.equalsIgnoreCase("gris")))
        {
            retornarColor = color;
        }

        return color;
    }

    public double precioFinal()
    {
        double precio = precioBase;

        //precio segun consumo energetico
        switch (consumoEnergetico)
        {
            case 65:
                precio += 100; //en caso de que sea A
                break;

            case 66:
                precio += 80; //en caso de que sea B
                break;

            case 67:
                precio += 60; //en caso de que sea C
                break;

            case 68:
                precio += 50; //en caso de que sea D
                break;

            case 69:
                precio += 30; //en caso de que sea E
                break;

            case 70:
                precio += 10; //en caso de que sea F
                break;

            case 97:
                precio += 100; //en caso de que sea a
                break;

            case 98:
                precio += 80; //en caso de que sea b
                break;

            case 99:
                precio += 60; //en caso de que sea c
                break;

            case 100:
                precio += 50; //en caso de que sea d
                break;

            case 101:
                precio += 30; //en caso de que sea e
                break;

            case 102:
                precio += 10; //en caso de que sea f
                break;
        }

        //precio segun tamaño
        if((peso > 0) && (peso <= 19))
        {
            precio += 10;
        }
        else if((peso >= 20) && (peso <= 49))
        {
            precio += 50;
        }
        else if((peso >= 50) && (peso <= 79))
        {
            precio += 80;
        }
        else if (peso >= 80)
        {
            precio += 100;
        }

        return precio;
    }
}
