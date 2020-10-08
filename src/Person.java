public class Person {
    //Q1

    private String name;

    //setting up the new constructor that is includes a parameter
    public Person (String name) {
        this.name = name;
    }

    //methods for the PERSON class
    public String getName(){
        //TODO: return the person's name
        return this.name;
    }

    public void setName(String name){
        //TODO: change the name property to the passed value
        this.name = name;
    }

    public void sayHello(){
        //TODO: print a message to the console using the person's name
        System.out.printf("Hello, your name is %s\n", this.name);
    }

    public static void main(String[] args) {
        Person chelsea = new Person("Chelsea");
        System.out.println("chelsea's name = " + chelsea.getName());
        chelsea.setName("Coven");
        chelsea.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName())); //TRUE
//        System.out.println(person1 == person2); // 2 different object reference ids: FALSE

//        Person person1 = new Person("John");
//        Person person2 = person1; //This will change both reference IDs and now change and share the same reference ID since they share the same memory box/spot
//        System.out.println(person1 == person2); /TRUE since we are making 2nd object reference the same as the 1st object reference

//        Person person1 = new Person("John");
//        Person person2 = person1; //This will change both reference IDs and now change and share the same reference ID since they share the same memory box/spot

//        System.out.println(person1.getName()); //John
//        System.out.println(person2.getName()); //John
//        person2.setName("Jane");
//        System.out.println(person1.getName()); //Jane
//        System.out.println(person2.getName()); //Jane
    }


}
