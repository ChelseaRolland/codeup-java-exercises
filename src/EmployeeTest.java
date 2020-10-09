public class EmployeeTest {
    public static void main(String[] args) {

        Employee[] employees = {
                new Developer("Coven", "R&D"),
                new Manager("Tanya", "Chill R&D")
        };

        for (Employee workers: employees) {
            System.out.println("workers.work() = " + workers.work());
        }


//        Employee coven = new Developer("Coven", "R&D");
//        Employee tanya = new Manager("Tanya", "Chill R&D");
//
//        System.out.println("coven.work() = " + coven.work());
//        System.out.println("tanya.work() = " + tanya.work());
    }
}
