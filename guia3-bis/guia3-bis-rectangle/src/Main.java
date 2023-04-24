import modelo.Rectangle;

public class Main {
    public static void main(String[] args)
    {
        Rectangle rectangulo = new Rectangle(20,10);
        System.out.println(rectangulo);
        System.out.println("Perimetro: ......... " + rectangulo.calculatePerimeter());
        System.out.println("Area: .............. " + rectangulo.calculateArea());

        System.out.println("\n--------------------------------------------------\n");
        rectangulo.setHeight(2);
        rectangulo.setWidth(6);
        System.out.println(rectangulo);
        System.out.println("Perimetro: ......... " + rectangulo.calculatePerimeter());
        System.out.println("Area: .............. " + rectangulo.calculateArea());

        System.out.println("\n--------------------------------------------------\n");
        Rectangle rectanguloXdefecto = new Rectangle();
        System.out.println(rectanguloXdefecto);
        System.out.println("Perimetro: ......... " + rectanguloXdefecto.calculatePerimeter());
        System.out.println("Area: .............. " + rectanguloXdefecto.calculateArea());
    }
}