package shapes;

public class Rectangle {
    /**

     Inside of your shapes directory, create a class named Rectangle. It should have protected properties for both length and width. Rectangle should define a constructor that accepts two numbers for length and width, and sets those properties.

     Create two methods on the Rectangle class, getArea and getPerimeter that return the respective values. The formulas for both follow:


     perimeter = 2 x length + 2 x width
     area = length x width

     **/

    protected double length;
    protected double width;

    public Rectangle(double aLength, double aWidth) {
        this.length = aLength;
        this.width = aWidth;
    }

    public double getArea(){
        return this.length * this.width;
    }

    public double getPerimeter () {
        return (this.length * 2) + (this.width * 2);
    }

}
