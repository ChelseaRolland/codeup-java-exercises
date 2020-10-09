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

//        Measurable myShape = new Rectangle(10, 15);
//        System.out.println(myShape.getArea());
//        System.out.println(myShape.getPerimeter());
//
//        myShape = new Square(9);
//        System.out.println(myShape.getArea());
//        System.out.println(myShape.getPerimeter());

        //Can instantiate a new array since its an array and not creating a new Measurable, but rather 2 data types of Rectangle and Shapes
        Measurable[] myShape = {
                new Rectangle(10,15),
                new Square(9)
        };

        for (Measurable shapes: myShape) {
            System.out.println("shapes.getPerimeter() = " + shapes.getPerimeter());
            System.out.println("shapes.getArea() = " + shapes.getArea());
        }

    }
}