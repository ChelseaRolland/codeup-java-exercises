package shapes;

public class Square extends Quadrilateral {

    public Square (double sides) {
        super(sides, sides);
    }

    @Override
    public double getArea() {
        return Math.pow(this.width, 2);
    }

    @Override
    public double getPerimeter() {
        return this.length * 4;
    }
}
