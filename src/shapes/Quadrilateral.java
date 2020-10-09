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
    public void setLength (double aLength) {
        this.length = aLength;
    }

    public void setWidth (double aWidth) {
        this.width = aWidth;
    }
}
