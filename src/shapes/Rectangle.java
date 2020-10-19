package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

    //Constructor
    public Rectangle(double aLength, double aWidth) {
        super(aLength, aWidth);
    }

    //setters
    @Override
    public void setLength (double aLength){
        this.length = aLength;
    }

    @Override
    public void setWidth (double aWidth){
        this.width = aWidth;
    }

    //methods
    @Override
    public double getArea() {
        System.out.println("This is the area of a Rectangle");
        return (2 * this.getLength()) + (2 * this.getWidth());
    }

    @Override
    public double getPerimeter() {
        System.out.println("This is the perimeter of a Rectangle");
        return this.getLength() * this.getWidth();
    }


}
