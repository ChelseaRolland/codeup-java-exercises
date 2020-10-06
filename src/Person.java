public class Person {
    //Q1

    private String name = "Chelsea";

    public String getName(){
        //TODO: return the person's name
        return name;
    }

    public void setName(String name){
        //TODO: change the name property to the passed value
        name = getName();
    }

    public void sayHello(){
        //TODO: print a message to the console using the person's name
        System.out.println("Hello, " + getName());
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Chelsea");
        person1.sayHello();
    }


}
