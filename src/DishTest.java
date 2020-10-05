public class DishTest {

    /**
     * * Create another class called DishTest
     *      * Add a main method and inside the method...
     *      *     1) instantiate a Dish object and assign to a variable called dish1
     *      *     2) assign creative values for each of the properties
     *      *     3) test the printSummary() method by invoking it and checking if all instance values are correctly printed   *
     *      * **/

    public static void main(String[] args) {
        Dish dish1 = new Dish();
        dish1.costInCents = 2100;
        dish1.nameOfDish = "Galaxcial Observance Vegan Medlay";
        dish1.wouldRecommend = true;
        dish1.printSummary();
    }

}
