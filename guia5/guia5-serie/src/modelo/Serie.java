package modelo;

public class Serie extends Elemento
{
    //---------------------------------------------------------------- ATRIBUTOS
    private int nroTemporadas;
    private String creador;
    //-------------------------VALORES DEFAULT
    private final int nroTemporadasDefault = 3;

    //------------------------------------------------------------------ METODOS
    // Un constructor por defecto
    public Serie()
    {
        super();
        this.nroTemporadas = nroTemporadasDefault;
        this.creador = "";
    }

    // Un constructor con el titulo y creador. El resto por defecto
    public Serie(String titulo, String creador)
    {
        super(titulo);
        this.nroTemporadas = nroTemporadasDefault;
        this.creador = creador;
    }

    // Un constructor con todos los atributos, excepto de entregado
    public Serie(String titulo, String creador, int nroTemporadas, String genero)
    {
        super(titulo, genero);
        this.nroTemporadas = nroTemporadas;
        this.creador = creador;
    }

    //Métodos get de todos los atributos, excepto de entregado
    public int getNroTemporadas()
    {
        return nroTemporadas;
    }
    public String getCreador()
    {
        return creador;
    }

    //Métodos set de todos los atributos, excepto de entregado
    public void setNroTemporadas(int nroTemporadas)
    {
        this.nroTemporadas = nroTemporadas;
    }

    public void setCreador(String creador)
    {
        this.creador = creador;
    }

    //Sobrescribe los métodos toString.
    public String toString()
    {
        return  super.toString() +
                "Nro de Temporadas: ....... " + nroTemporadas + "\n" +
                "Creador: ................. " + creador;
    }

    //Método compareTo (Object a),compara en las series el numero de temporadas
    public boolean compareTo(Object a)
    {
        boolean iguales = false;

        if(a instanceof Serie)
        {
            Serie s = (Serie) a;
            if(s.getNroTemporadas() == this.nroTemporadas)
                iguales = true;
        }

        return iguales;
    }
}
