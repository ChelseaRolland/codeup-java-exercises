package grades;

import java.util.ArrayList;

public class Student {

    //private fields
    private String studentName;
    private ArrayList<Integer> grades;

    //Constructor
    public Student (String aName) {
        this.studentName = aName;
        this.grades = new ArrayList<>();
    }

    //Methods

    // returns the student's name
    public String getName(){
        return this.studentName;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade){
        this.grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        double sum = 0;
        for (Integer grade : this.grades) {
            sum += (double) grade;
        }
        return sum / this.grades.size();
    }

    public static void main(String[] args) {
        Student student1 = new Student("Chelsea");
        student1.addGrade(100);
        student1.addGrade(85);
        student1.addGrade(97);

        System.out.println("student1.getGradeAverage() = " + student1.getGradeAverage());

    }


}
