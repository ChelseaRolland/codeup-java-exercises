package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input () {
        this.scanner = new Scanner(System.in);
    };

    String userResponse = new Input().scanner.nextLine();

    public String getString() {
        return "";
    };

    public boolean yesNo() {
//        String userResponse = new Input();
        if (userResponse.equalsIgnoreCase("y") || userResponse.equalsIgnoreCase("yes")) {
            return true;
        }
        return false;
    };

    public int getInt(int min, int max) {
        return 0;
    };

    public int getInt() {
        return 0;
    };

    public double getDouble(double min, double max) {
        return 0.1;
    };

    public double getDouble() {
        return 0.1;
    };




}
