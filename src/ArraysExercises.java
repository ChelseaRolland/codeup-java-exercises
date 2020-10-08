import java.util.Arrays;

public class ArraysExercises {

    /**

     Array Basics

     Create a class inside of src named ArraysExercises. Create a main method for this class to do your work.

     What happens when you run the following code? Why is Arrays.toString necessary?

     Copied to clipboard
     int[] numbers = {1, 2, 3, 4, 5};
     System.out.println(numbers);
     Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element. Iterate through the array and print out the name of each person in the array.

     Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.

     **/

    public static void main(String[] args) {
        //Q1
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        //Creating the array of person objects with 3 elements
        Person[] perPerson = new Person[3];

        //Adding the objects to the perPerson Array
        perPerson[0] = new Person("Chelsea");
        perPerson[1] = new Person("Naruto");
        perPerson[2] = new Person("Mononoke");

        //Iterate thru each element of the perPerson array to get their names
        for (Person people : perPerson) {
            System.out.println("people.getName() = " + people.getName());
        }

        addPerson(perPerson, new Person("Bleach"));
        addPerson(perPerson, new Person("Itachi"));

    }

    public static Person[] addPerson (Person[] originalArr, Person personToAdd) {
        //Generate the copy of the array with the added length
        Person[] copyOfPpl = Arrays.copyOf(originalArr, originalArr.length+1);
        //With the new spot available at the end of the new copied array, add the single obj to that opened spot
        copyOfPpl[copyOfPpl.length - 1] = personToAdd;
        //Void element --> return the another forEach loop to list out all of the element of an array system.out.println method
        //System.out.println("copyOfPpl = " + Arrays.toString(copyOfPpl));
        for (Person people : copyOfPpl) {
            System.out.println(people.getName());
        }
        return copyOfPpl;
    }

    public static void addPerson1 (Person[] ppl, Person obj) {
        //Generate the copy of the array with the added length
        Person[] copyOfPpl = Arrays.copyOf(ppl, ppl.length+1);
        //Or you can update the value for the original array to use less code
        ppl = Arrays.copyOf(ppl, ppl.length+1);
        //With the new spot available at the end of the new copied array, add the single obj to that opened spot
        copyOfPpl[copyOfPpl.length - 1] = obj;
        ppl[ppl.length - 1] = obj;
        //Void element --> return the another forEach loop to list out all of the element of an array system.out.println method
        //System.out.println("copyOfPpl = " + Arrays.toString(copyOfPpl));
        for (Person people : copyOfPpl) {
            System.out.println(people.getName());
        }
    }

    public static Person[] addPerson2 (Person[] ppl, Person obj) { //this just have 3 lines of code
        //you can update the value for the original array to use less code
        ppl = Arrays.copyOf(ppl, ppl.length+1);
        //With the new spot available at the end of the new copied array, add the single obj to that opened spot
        ppl[ppl.length - 1] = obj;
        //return an array since that is what we set the data type to
        return ppl;
        }

}
