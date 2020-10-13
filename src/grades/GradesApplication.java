package grades;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        //1st Student
        Student person1 = new Student("Coven");
        //Adding the grades
        person1.addGrade(100);
        person1.addGrade(60);
        person1.addGrade(77);
        //Adding it to the HashMap
        students.putIfAbsent("callistoBreeze", person1);


        //2nd Student
        Student person2 = new Student("Rivers");
        //Adding the grades
        person1.addGrade(88);
        person1.addGrade(78);
        person1.addGrade(98);
        //Adding it to the HashMap
        students.putIfAbsent("bongShanks",person2);


        //3rd Student
        Student person3 = new Student("Dylan");
        //Adding the grades
        person1.addGrade(74);
        person1.addGrade(77);
        person1.addGrade(79);
        //Adding it to the HashMap
        students.putIfAbsent("zillerBillerChiller", person3);


        //4th Student
        Student person4 = new Student("Bella");
        //Adding the grades
        person1.addGrade(92);
        person1.addGrade(83);
        person1.addGrade(94);
        //Adding it to the HashMap
        students.putIfAbsent("waitingForWeekends", person4);

        System.out.println(students);
        
        //Create the Command Line Interface
        System.out.println("Welcome!");
        System.out.println("Here are the Github usernames of our students: ");
        for (String username: students.keySet()) {
            System.out.printf(" | %s | ", username);
        }
        System.out.println("What student would you like to see more information on?");


    }
}
