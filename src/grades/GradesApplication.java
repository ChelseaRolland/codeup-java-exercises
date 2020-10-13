package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        //1st Student
        Student person1 = new Student("Coven");
        //Adding the grades
        person1.addGrade(100);
        person1.addGrade(60);
        person1.addGrade(77);
        //person1.getGradeAverage();
        //Adding it to the HashMap
        students.putIfAbsent("callistoBreeze", person1);


        //2nd Student
        Student person2 = new Student("Rivers");
        //Adding the grades
        person2.addGrade(88);
        person2.addGrade(78);
        person2.addGrade(98);
        //person2.getGradeAverage();
        //Adding it to the HashMap
        students.putIfAbsent("bongShanks",person2);


        //3rd Student
        Student person3 = new Student("Dylan");
        //Adding the grades
        person3.addGrade(74);
        person3.addGrade(77);
        person3.addGrade(79);
        //person3.getGradeAverage();
        //Adding it to the HashMap
        students.putIfAbsent("zillerBillerChiller", person3);


        //4th Student
        Student person4 = new Student("Bella");
        //Adding the grades
        person4.addGrade(92);
        person4.addGrade(83);
        person4.addGrade(94);
        //person4.getGradeAverage();
        //Adding it to the HashMap
        students.putIfAbsent("waitingForWeekends", person4);

        System.out.println(students);
        
        //Create the Command Line Interface
        System.out.println("Welcome!");
        System.out.println("Here are the Github usernames of our students: ");
        for (String username: students.keySet()) {
            System.out.printf(" | %s | ", username);
        }

        System.out.println();

        //Finding the students and their grades
        gradeList(students);

    }

    public static void gradeList (HashMap students) {
        System.out.println("What student would you like to see more information on?");

        //Create a Scanner
        Scanner scan = new Scanner(System.in);
        String userInput = scan.nextLine().trim();

        //Conditional
        if (students.containsKey(userInput)) {
            //Change the key's value into the student data type so you can access the Student class methods
            Student selectedPerson = (Student) students.get(userInput);
            System.out.printf("Name: %s - Github Username: %s\n", selectedPerson.getName(), userInput);
            System.out.printf("Current Average: %.1f\n", selectedPerson.getGradeAverage());
        } else {
            System.out.printf("Sorry, no student found with the GitHub username of \"%s\".\n", userInput);
        }

        //Ask the user if they want to to continue
        System.out.println("Would you like to see another student?");
        String userResponse = scan.nextLine().trim();
        if (userResponse.equalsIgnoreCase("y") || userResponse.equalsIgnoreCase("yes")) {
            //if yes, then use recursion
            gradeList(students);
        } else {
            System.out.println("Goodbye, and have a wonderful day!");
        }

    }

}
