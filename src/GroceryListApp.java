import util.Input;

import java.util.ArrayList;
import java.util.HashMap;

public class GroceryListApp {
    private static HashMap groceryList;
    //private field
    //private HashMap<String, Integer> groceryList;

    //Constructor
    public GroceryListApp () {
        this.groceryList = new HashMap<>();
    }

    //getter
    public HashMap getGroceryList () {
        return this.groceryList;
    }

    public static void main(String[] args) {
        Input userInput = new Input();
        System.out.println("Hey! Wanna create a grocery list? [y/n]");
        //System.out.println("Please select one of the following choices?");
        //System.out.println("Enter the name of the item");
        //System.out.println("How many?");
        
        groceryChoices(groceryList);
    }

    public static void groceryChoices (HashMap<String, Integer> lists) {
        //Scanners
        Input userInput = new Input();
        //Integer userChoice = userInput.getInt(1,5);
        //String items = userInput.getString();
        //Integer numOfItems = userInput.getInt();


        //Number of Choices
        System.out.println("Please select one of the following choices?");
        System.out.println("\n" + "1 --> Produce\n" + "2 --> Meats\n" + "3 --> Dairy\n" + "4 --> Sweets\n" + "5 --> Frozen\n");
//        switch (userChoice) {
//            case 1:
//                System.out.println("PRODUCE");
//                break;
//            case 2:
//                System.out.println("MEATS");
//                break;
//            case 3:
//                System.out.println("DAIRY");
//                break;
//            case 4:
//                System.out.println("SWEETS");
//                break;
//            case 5:
//                System.out.println("FROZEN");
//                break;
//            default:
//                System.out.println("This is not an option. Please choose one of the given options.");
//                break;
//        }


        //Enter the name of items
        System.out.println("Enter the name of the item. & How many?");
        //lists.putIfAbsent(items, numOfItems);

        //How many items
        //System.out.println("How many?");

        //Finalize the the list
        System.out.println("Do you want to finalize your grocery list?");
        if (userInput.yesNo()) {
            System.out.println("Sort the HEMPMAP HERE");
        } else {
            groceryChoices(lists);
        }

    }


}
