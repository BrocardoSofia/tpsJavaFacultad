package modelo;

import interfaz.Extremos;

import java.util.ArrayList;

public class Matematicas implements Extremos
{
    //------------------------------------------------------------------ ATRIBUTOS
    private ArrayList<Double> arreglo;


    //------------------------------------------------------------------ METODOS
    public Matematicas()
    {
        arreglo = new ArrayList<>();
        int limite = 5 + (int)(Math.random()*10);

        for(int i=0; i<limite; i++)
        {
            arreglo.add((Math.random()*10));
        }

    }

    public String imprimir()
    {
        String rta = "";

        for (double num : arreglo)
            rta += (num+"\n");

        return rta;
    }

    @Override
    public double inicio()
    {
        double numInicio = 0;

        if(!arreglo.isEmpty())
            numInicio = arreglo.get(0);

        return numInicio;
    }

    @Override
    public double fin()
    {
        double numFin = 0;

        if(!arreglo.isEmpty())
            numFin = arreglo.get((arreglo.size()-1));

        return numFin;
    }
}
