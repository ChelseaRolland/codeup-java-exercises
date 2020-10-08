package shapes;

public class Square extends Rectangle {
    //creating a constructor with the Square
    public Square (int side){
        //Referencing the superclass Rectangle constructor by using super
        //side its a a square, both the length and width will be the same value
        super(side, side);
    }

    int side = super.length;

    public int getPerimeter () {
//        int sides = super(this.sides, this.sides);
        return 4 * this.side;
    }

    public int getArea () {
//        return this.side ^ 2 ; // this just added the value of this.side to 2; I'm not too sure why
        return (int) Math.pow(this.side, 2);
    }
}
