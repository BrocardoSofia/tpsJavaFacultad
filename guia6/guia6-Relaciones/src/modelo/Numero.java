package modelo;

import interfaz.Relaciones;

public class Numero implements Relaciones
{
    //------------------------------------------------------------------ ATRIBUTOS
    int numero;

    //------------------------------------------------------------------ METODOS
    public Numero(int numero)
    {
        this.numero = numero;
    }

    public int getNumero()
    {
        return numero;
    }

    @Override
    public boolean esMayor(Object b)
    {
        boolean rta = false;

        if(b instanceof Numero)
        {
            Numero a = (Numero) b;
            if(numero > ((Numero) b).getNumero())
                rta = true;
        }

        return rta;
    }

    @Override
    public boolean esMenor(Object b) {
        boolean rta = false;

        if(b instanceof Numero)
        {
            Numero a = (Numero) b;
            if(numero < ((Numero) b).getNumero())
                rta = true;
        }

        return rta;
    }

    @Override
    public boolean esIgual(Object b) {
        boolean rta = false;

        if(b instanceof Numero)
        {
            Numero a = (Numero) b;
            if(numero == ((Numero) b).getNumero())
                rta = true;
        }

        return rta;
    }
}
