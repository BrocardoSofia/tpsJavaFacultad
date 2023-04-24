package modelo;

public class Hora
{
    //--------------------------------------------------------- ATRIBUTOS
    private int hora;
    private int minuto;
    private int segundo;

    //--------------------------------------------------------- METODOS
    private int verificarHora(int hora)
    {
        if(hora < 0)
            hora*=-1; //si es en negativo lo paso a positivo
        else if(hora > 23)
            hora = 23; //si es mayor a 23 se pasa a 23 que es la hora maxima que se acepta

        return hora;
    }

    private int verificarMinuto(int minuto)
    {
        if(minuto < 0)
            minuto*=-1; //lo paso a positivo
        else if(minuto > 59)
            minuto = 59;

        return minuto;
    }

    private int verificarSegundo(int segundo)
    {
        if(segundo < 0)
            segundo*=-1; //lo paso a positivo
        else if(segundo > 59)
            segundo = 59;

        return segundo;
    }

    public Hora(int hora, int minuto, int segundo)
    {
        this.hora = verificarHora(hora);
        this.minuto = verificarMinuto(minuto);
        this.segundo = verificarSegundo(segundo);
    }

    private String imprimirHora()
    {
        String rta = "";

        if(hora < 10)
            rta = "0";

        rta += hora;

        return rta;
    }

    private String imprimirMinuto()
    {
        String rta = "";

        if(minuto < 10)
            rta = "0";

        rta += minuto;

        return rta;
    }

    private String imprimirSegundo()
    {
        String rta = "";

        if(segundo < 10)
            rta = "0";

        rta += segundo;

        return rta;
    }

    public String toString()
    {
        return imprimirHora()+":"+imprimirMinuto()+":"+imprimirSegundo();
    }

    public void avanzarUnSegundo()
    {
        segundo++;

        if (segundo == 60)
        {
            avanzarUnMinuto();
            segundo = 0;
        }

    }

    private void avanzarUnMinuto()
    {
        minuto++;

        if (minuto == 60)
        {
            avanzarUnaHora();
            minuto = 0;
        }

    }

    private void avanzarUnaHora()
    {
        hora++;

        if(hora == 24)
            hora = 0;
    }

    public void retrocederUnSegundo()
    {
        segundo--;

        if(segundo == -1)
        {
            retrocederUnMinuto();
            segundo = 59;
        }
    }

    private void retrocederUnMinuto()
    {
        minuto--;

        if(minuto == -1)
        {
            minuto = 59;
            retrocederUnaHora();
        }
    }

    private void retrocederUnaHora()
    {
        hora--;

        if(hora == -1)
        {
            hora = 23;
            minuto = 59;
            segundo = 59;
        }
    }
}
