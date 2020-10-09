package shapes;

import java.security.MessageDigest;

public class ShapesTest {
    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(5, 4);
//        System.out.println("box1.getArea() = " + box1.getArea());
//        System.out.println("box1.getPerimeter() = " + box1.getPerimeter());
//
//        //polymorphism
//        Rectangle box2 = new Square(5);
//        System.out.println("box2.getPerimeter() = " + box2.getPerimeter());
//        System.out.println("box2.getArea() = " + box2.getArea());

        Measurable[] myShape = {
                new Rectangle(5,4),
                new Square(5)
        };

        for (Measurable shapes: myShape) {
            System.out.println("shapes.getPerimeter() = " + shapes.getPerimeter());
            System.out.println("shapes.getArea() = " + shapes.getArea());
        }

    }
}