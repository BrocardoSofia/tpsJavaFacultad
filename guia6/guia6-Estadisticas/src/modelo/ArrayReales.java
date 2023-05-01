package modelo;

import interfaz.Estadísticas;

import java.util.ArrayList;

public class ArrayReales implements Estadísticas
{
    //---------------------------------------------------------------------- ATRIBUTOS
    private ArrayList<Double> lista;

    //---------------------------------------------------------------------- METODOS
    public ArrayReales()
    {
        lista = new ArrayList<>();
    }

    public void agregarALista(double numero)
    {
        lista.add(numero);
    }

    @Override
    public double minimo()
    {
        double numMinimo = 0;

        if(!lista.isEmpty())
        {
            numMinimo = lista.get(0);//obtengo el primer numero como minimo
            for(double num : lista)
            {
                if(numMinimo > num) //cuando encuentro un nuevo minimo lo reemplazo
                    numMinimo = num;
            }
        }

        return numMinimo;
    }

    @Override
    public double maximo()
    {
        double numMaximo = 0;

        if(!lista.isEmpty())
        {
            numMaximo = lista.get(0);//obtengo el primer numero como maximo
            for(double num : lista)
            {
                if(numMaximo < num) //cuando encuentro un nuevo maximo lo reemplazo
                    numMaximo = num;
            }
        }

        return numMaximo;
    }

    @Override
    public double sumatorio()
    {
        double rta = 0;

        for(double num : lista)
        {
            rta+=num;
        }

        return rta;
    }

    public String imprimir()
    {
        String rta = "";

        for(double num : lista)
        {
            rta+=num+"\n";
        }

        return rta;
    }
}
