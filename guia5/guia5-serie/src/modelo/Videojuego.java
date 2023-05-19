package modelo;

public class Videojuego extends Elemento
{
    //------------------------------------------------------------------- ATRIBUTOS
    private int horasEstimadas;
    private String compania;
    //--------------------------------valores default
    private final int horasEstimadasDefault = 10;

    //------------------------------------------------------------------- METODOS
    // Un constructor por defecto
    public Videojuego()
    {
        super();
        this.horasEstimadas = horasEstimadasDefault;
        this.compania = "";
    }

    // Un constructor con el titulo y horas estimadas. El resto por defecto
    public Videojuego(String titulo, int horasEstimadas)
    {
        super(titulo);
        this.horasEstimadas = horasEstimadas;
        this.compania = "";
    }

    // Un constructor con todos los atributos, excepto de entregado
    public Videojuego(String titulo, int horasEstimadas, String genero, String compania)
    {
        super(titulo, genero);
        this.horasEstimadas = horasEstimadas;
        this.compania = compania;
    }

    //Métodos get de todos los atributos, excepto de entregado
    public int getHorasEstimadas()
    {
        return horasEstimadas;
    }
    public String getCompania()
    {
        return compania;
    }

    //Métodos set de todos los atributos, excepto de entregado
    public void setHorasEstimadas(int horasEstimadas)
    {
        this.horasEstimadas = horasEstimadas;
    }
    public void setCompania(String compania)
    {
        this.compania = compania;
    }

    //Sobrescribe los métodos toString.
    public String toString()
    {
        return  super.toString() +
                "Horas estimadas: ......... " + horasEstimadas + "hs\n" +
                "Compania: ................ " + compania;
    }

    //Método compareTo (Object a), compara las horas estimadas en los videojuegos
    public boolean compareTo(Object a)
    {
        boolean iguales = false;

        if(a instanceof Videojuego)
        {
            Videojuego v = (Videojuego) a;//casteo seguro de a a videojuego
            if(v.getHorasEstimadas() == this.horasEstimadas)
                iguales = true;
        }

        return iguales;
    }
}
