public class Developer extends Employee{

    public Developer (String aName, String aDepartment) {
        super(aName, aDepartment);
    }

    public Developer (String aName) {
        super(aName, "Development");
    }

    @Override
    public String work() {
        return "writing code";
    }

}
