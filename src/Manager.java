public class Manager extends Employee{
    public Manager (String aName, String aDepartment) {
        super(aName, aDepartment);
    }

    @Override
    public String work() {
        return "holding meetings";
    }
}
