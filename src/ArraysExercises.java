import java.util.Arrays;

public class ArraysExercises {
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
            System.out.println(people.getName());
        }

        addPerson(perPerson, new Person("Bleach"));



    }

    public static void addPerson (Person[] ppl, Person obj) {
        //Generate the copy of the array with the added length
        Person[] copyOfPpl = Arrays.copyOf(ppl, ppl.length+1);
        //With the new spot available at the end of the new copied array, add the single obj to that opened spot
        copyOfPpl[copyOfPpl.length - 1] = obj;
        //Void element --> return the another forEach loop to list out all of the element of an array system.out.println method
        System.out.println("copyOfPpl = " + Arrays.toString(copyOfPpl));
        for (Person people : copyOfPpl) {
            System.out.println(people.getName());
        }
    }

}
