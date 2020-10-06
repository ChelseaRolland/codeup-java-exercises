package util;

public class InputTest {
    public static void main(String[] args) {

        Input input = new Input();
        if (input.yesNo()) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

        System.out.println(input.getInt(0,10));


    }
}
