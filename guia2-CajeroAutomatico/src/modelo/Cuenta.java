package modelo;

public class Cuenta {
    private float saldo;
    private Ticket ultimaOperacion;

    public Cuenta(float saldo)
    {
        this.saldo = saldo;
        ultimaOperacion = null;
    }

    public Cuenta()
    {
        saldo = 0;
        ultimaOperacion = null;
    }

    public void ingresar(float monto)
    {
        saldo+=monto;
        ultimaOperacion = new Ticket(monto,"Deposito");
    }

    public boolean extraer(float monto)
    {
        boolean completado = false;

        if(monto <= saldo)
        {
            saldo-=monto;
            ultimaOperacion = new Ticket(monto, "Extraccion");
            completado = true;
        }

        return completado;
    }

    public float getSaldo()
    {
        return  saldo;
    }

    @Override
    public String toString() {
        String rta = "Cuenta{" +"Saldo=" + saldo;

        if(ultimaOperacion != null)
        {
            rta += ", Ultima Operacion=" + ultimaOperacion.toString();
        }

        rta += '}';
        return rta;
    }
}
