package modelo;

public class Persona
{
    //_______________________________________________________________________ ATRIBUTOS
    private String nombre;
    private int edad;
    private int DNI;
    private char sexo;
    private float peso;
    private float altura;
    //________________________________________________________________________ METODOS
    public Persona()
    {
        this.nombre = "";
        this.edad = 0;
        this.DNI = generaDNI();
        this.sexo = 'H';
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String nombre, int edad, char sexo)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = generaDNI();
        this.sexo = sexo;
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String nombre, int edad, char sexo, float peso, float altura)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = generaDNI();
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    private int generaDNI()
    {
        return (int) (Math.random()*(99999999-11111111+1)+11111111);
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void setEdad(int edad)
    {
        this.edad = edad;
    }

    public void setSexo(char sexo)
    {
        this.sexo = sexo;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setPeso(float peso)
    {
        this.peso = peso;
    }

    public int calcularIMC()
    {
        //peso en kg/(altura^2  en m)
        int rta;
        double imc = peso/(Math.pow((double)altura,2));

        if(imc < 20)
            rta = -1;
        else if ((imc >= 20) && (imc <= 25))
            rta = 0;
        else
            rta = 1;

        return rta;
    }

    public boolean esMayorDeEdad()
    {
        boolean esMayor = false;

        if(edad >= 18)
            esMayor = true;

        return esMayor;
    }

    public boolean comprobarSexo(char sexo)
    {
        boolean esIgual = false;

        if(this.sexo == sexo)
            esIgual = true;

        return esIgual;
    }

    @Override
    public String toString() {
        return "modelo.Persona: " +
                "\n Nombre: ........... " + nombre +
                "\n Edad: ............. " + edad +
                "\n DNI: .............. " + DNI +
                "\n Sexo: ............. " + sexo +
                "\n Peso: ............. " + peso + " kg" +
                "\n Altura: ........... " + altura + " m";
    }
}
