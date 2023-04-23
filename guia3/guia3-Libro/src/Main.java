import modelo.Autor;
import modelo.Libro;

public class Main {
    public static void main(String[] args)
    {
        Libro libro;
        Autor autor;

        autor = new Autor("Joshua","Bloch","joshua@email.com",'m');

        System.out.println(autor + "\n");

        libro = new Libro("Effective Java", 450, 150, autor);
        System.out.println(libro + "\n");

        libro.setPrecio(500);
        libro.setStock((libro.getStock())+50);

        System.out.println(libro + "\n");

        System.out.println(libro.mostrarAutor() + "\n");

        System.out.println(libro.mensajeInfoLibro() + "\n");
    }
}