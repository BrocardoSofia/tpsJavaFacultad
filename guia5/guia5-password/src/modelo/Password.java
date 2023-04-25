package modelo;

public class Password
{
    //---------------------------------------------------------------------- ATRIBUTOS
    private int longitud;
    private String contraseña;

    //---------------------------------------------------------------------- METODOS
    private void generarPassword()
    {
        char caracter;
        int control;
        this.contraseña = "";//reseteo la contraseña por si se regenero

        for(int i=0; i<longitud; i++)
        {
            do {
                caracter = (char)(Math.random()*(122-48+1)+48);
                control = caracter;
            }while (((control>=58)&&(control<=64)) || ((control>=91)&&(control<=96)));

            this.contraseña+=caracter;
        }
    }
    public Password()
    {

        this.longitud = 8;
        generarPassword();
    }

    public Password(int longitud)
    {
        this.longitud = longitud;
        generarPassword();
    }

    public int getLongitud()
    {
        return longitud;
    }

    public String getContraseña()
    {
        return contraseña;
    }

    public boolean esFuerte()
    {
        //para que sea fuerte debe tener más de 2 mayúsculas, más de 1 minúscula y más de 5 números
        int mayuscula = 0, minuscula = 0, numeros = 0, control;
        boolean fuerte = false;

        //cuento las mayusculas, minusculas y numeros
        for (int i=0; i<longitud; i++)
        {
            control = contraseña.charAt(i);//obtengo 1 caracter y lo asigno a control

            //veo que tipo de caracter es
            if((control>=48) && (control<=57))
                numeros++;
            else if((control>=65)&&(control<=90))
                mayuscula++;
            else
                minuscula++;
        }

        //controlo que sea una contraseña fuerte
        if((mayuscula>=2)&&(minuscula>=1)&&(numeros>=5))
            fuerte = true;

        return fuerte;
    }

    public void setLongitud(int longitud)
    {
        this.longitud = longitud;
        generarPassword();
    }

}
