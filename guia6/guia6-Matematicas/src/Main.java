import modelo.Matematicas;

public class Main {
    public static void main(String[] args)
    {
        Matematicas mate = new Matematicas();

        System.out.println(" ---------------------");
        System.out.println("| ARREGLO MATEMATICAS |");
        System.out.println(" ---------------------");
        System.out.println(mate.imprimir());
        System.out.println("Inicio: .......... " + mate.inicio());
        System.out.println("Fin: ............. " + mate.fin());
    }
}