public class HelloWorld {
    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        System.out.print("Hello, ");
        System.out.print("World!");
        System.out.println();

        //Q1
        int myFavoriteNumber = 13;
        System.out.println(myFavoriteNumber);

        //Q2
        String myString = "Fun-Times Ahead!";
        System.out.println(myString);

        //Q3
        myString = "We really doing this!";
        System.out.println(myString);

        //Q4
        //myString = (char) 'c'; //Error different data type than a String
        //myString = Character.toString('c'); //This will work

        //Q4.1
        //myString = 3.14159; //Error different data type than a string

        //Q5
        //long myNumber;
        //System.out.print(myNumber);
        //myNumber variable has not been initialized


        //Q6
        //long myNumber = 3.14;
        //System.out.print(myNumber);
        //3.14 is an incompatible number data type

        //Q7
        //long myNumber = 123L;
        //System.out.print(myNumber);

        //Q8
        //myNumber = 123;
        //System.out.print(myNumber);

        //Q9
        //float myNumber = 3.14; //ERROR
        //float myNumber = 3.14F; //WORKS
        //System.out.println(myNumber);
        //3.14 is an incompatible number data type from DOUBLE to FLOAT, need to add F at the end of it

        // 9.1) myNumber = (long) 3.14;
        // 9.2) float myNewNumber = 3.14F

        //Q10
        //int x = 5;
        //System.out.println(x++);
        //System.out.println(x);

        //int x = 5;
        //System.out.println(++x);
        //System.out.println(x);

        //Q11
        //String class = "class"; //ERROR due to class being a reserved words
        //System.out.print(class); //ERROR

        //Q12
        //String theNumberThree = "three";
        //Object o = theNumberThree;
        //int three = (int) o;

        //int three = (int) "three";
        //System.out.println(three);

        //Q13
        //int x = 4;
        //x += 5;
        //System.out.println(x);

        //int x = 3;
        //int y = 4;
        //y *= x;
        //System.out.println(y);

        //int x = 10;
        //int y = 2;
        //x /= y;
        //y -= x;
        //
        //System.out.println(x);
        //System.out.println(y);

        //Q14
        //byte num = 125;
        //num += 5;

        //byte num1 = 127;
        //num1++;

        //System.out.println(num);
        //System.out.println(num1);
    }
}
