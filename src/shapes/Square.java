package shapes;

public class Square extends Quadrilateral {

    //Constructor
    public Square (double side) {
        super(side, side);
    }

    //setters
    @Override
    public void setLength (double aLength){
        this.length = aLength;
        this.width = aLength;
    }

    @Override
    public void setWidth (double aWidth){
        this.width = aWidth;
        this.length = aWidth;
    }

    //methods
    @Override
    public double getArea() {
        System.out.println("This is the area of a Square");
        return Math.pow(this.getWidth(), 2);
    }

    @Override
    public double getPerimeter() {
        System.out.println("This is the perimeter of a Square");
        return this.getLength() * 4;
    }


}
