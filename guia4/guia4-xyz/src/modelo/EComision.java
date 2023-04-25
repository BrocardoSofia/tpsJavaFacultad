package modelo;

public class EComision extends Empleado
{
    //----------------------------------------------------------------------------------- ATRIBUTOS
    private int clientesCaptados;
    private float montoXclienteCaptado;
    private final float salarioMinimo = 750;

    //----------------------------------------------------------------------------------- METODOS
    public EComision(String DNI, String nombre, String apellido, int añoDeIngreso,
                      int clientesCaptados, float montoXclienteCaptado)
    {
        super(DNI, nombre, apellido, añoDeIngreso);

        this.clientesCaptados = clientesCaptados;
        this.montoXclienteCaptado = montoXclienteCaptado;
    }

    public EComision()
    {
        super();
        clientesCaptados = 0;
        montoXclienteCaptado = 0;
    }

    public void setMontoXclienteCaptado(float montoXclienteCaptado)
    {
        this.montoXclienteCaptado = montoXclienteCaptado;
    }

    public void setClientesCaptados(int clientesCaptados)
    {
        this.clientesCaptados = clientesCaptados;
    }

    public float obtenerSalario()
    {
        //El salario se obtiene multiplicando los clientes captados por el monto por cliente, si el salario
        //por los clientes captados no llega al salario mínimo, cobrará esta cantidad.
        float salario = clientesCaptados * montoXclienteCaptado;

        if(salario < salarioMinimo)
            salario = salarioMinimo;

        return salario;
    }

    public int getClientesCaptados()
    {
        return clientesCaptados;
    }

    public float getMontoXclienteCaptado()
    {
        return montoXclienteCaptado;
    }
}
