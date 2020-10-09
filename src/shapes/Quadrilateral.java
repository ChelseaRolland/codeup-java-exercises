package shapes;

public class Quadrilateral extends Shape implements Measurable{
    protected double length;
    protected double width;

    @Override
    public double getArea() {
        return getLength() * getWidth();
    }

    public double getPerimeter() {
        return (2 * getLength()) + (2 * getWidth());
    }

    public Quadrilateral (double aLength, double aWidth) {
        this.length = aLength;
        this.width = aWidth;
    }

    //getters
    public double getLength () {
        return this.length;
    }

    public double getWidth () {
        return this.width;
    }

    //setters
    public static void setLength (double aLength) {
        System.out.println(aLength);
    }

    public static void setWidth (double aWidth) {
        System.out.println(aWidth);
    }
}
