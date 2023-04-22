package modelo;

import java.time.LocalDate;

public class Ticket {
    private float monto;
    private LocalDate fecha;
    String operacion;

    public Ticket(float monto, String operacion)
    {
        this.monto = monto;
        fecha = LocalDate.now();
        this.operacion = operacion;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "monto=" + monto +
                ", fecha=" + fecha +
                ", operacion='" + operacion + '\'' +
                '}';
    }
}
