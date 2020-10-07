package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        System.out.println("Please enter a radius");
        Input input = new Input();
        double radi = input.getDouble(0, 1000);
        Circle pizza = new Circle(radi);
        System.out.println("pizza.getCircumference() = " + pizza.getCircumference());
        System.out.println("pizza.getArea() = " + pizza.getArea());
    }
}
