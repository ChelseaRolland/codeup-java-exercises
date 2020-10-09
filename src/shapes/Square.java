package shapes;

public class Square extends Rectangle {
    //creating a constructor with the Square
    public Square (double side){
        //Referencing the superclass Rectangle constructor by using super
        //side: its a square, both the length and width will be the same value
        super(side, side);
    }

    //This is from the instructor review
//    @Override //it is best to state this in the code to know it was intentional
//    public double getArea(){
//        return Math.pow(this.length, 2);
//    }
//
//    @Override //it is best to state this in the code to know it was intentional
//    public double getPerimeter(){
//        return 4 * this.width;
//    }


    public double getPerimeter () {
        //for the value, you can pull the property from the superclass Rectangle since you have access to it; and because 1 side of a square is the same as either the width or the length
        System.out.println("Square getPerimeter()");
        return 4 * this.length;
    }

    public double getArea () {
        //for the value, you can pull the property from the superclass Rectangle since you have access to it; and because 1 side of a square is the same as either the width or the length
        System.out.println("Square getArea()");
        return Math.pow(this.length, 2);
    }
}
