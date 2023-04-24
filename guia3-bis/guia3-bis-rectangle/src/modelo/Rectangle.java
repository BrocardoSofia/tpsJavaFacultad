package modelo;

public class Rectangle
{
    private int width;
    private int height;

    public Rectangle()
    {
        width = 1;
        height = 1;
    }

    public Rectangle(int width, int height)
    {
        this.width = width;
        this.height = height;
    }

    public float calculateArea()
    {
        return (float)width*height;
    }

    public float calculatePerimeter()
    {
        return (float) (width*2) + (height*2);
    }

    public int getWidth()
    {
        return width;
    }

    public int getHeight()
    {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangulo: " +
                "\nAncho .........." + width +
                "\nAlto ..........." + height;
    }
}
