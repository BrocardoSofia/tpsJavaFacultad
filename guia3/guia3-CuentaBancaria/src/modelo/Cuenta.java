package modelo;

public class Cuenta {
    private String id;
    private Cliente cliente;
    private float balance;
    private float limiteDeuda;

    public Cuenta(String id, Cliente cliente, float balance, float limiteDeuda)
    {
        this.id = id;
        this.cliente = cliente;
        this.balance = balance;
        this.limiteDeuda = limiteDeuda;
    }

    public float getBalance()
    {
        return balance;
    }

    public float getLimiteDeuda()
    {
        return limiteDeuda;
    }

    @Override
    public String toString() {
        return "Cuenta" +
                "\n Id ............ " + id +
                "\n " + cliente.toString() +
                "\n Balance ....... $" + balance;
    }

    public void depositar(float monto)
    {
        balance+=monto;
    }

    public boolean extraer(float monto)
    {
        boolean completado = false;

        if((balance-monto) >= (limiteDeuda * -1))
        {
            balance-=monto;
            completado = true;
        }

        return completado;
    }

    public Cliente getCliente()
    {
        return cliente;
    }
}
