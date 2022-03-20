package ExerciseTinhDongGoi;

public class MainEmployee {
    public static void main(String[] args) {
        //Test constructor and toString()
        Employee e1 = new Employee(1, " Mua", "Bui", 1000);
        System.out.println(e1);

        //Test setters và getters
        e1.setSalary(2000);
        System.out.println(e1);
        System.out.println("ID is: " + e1.getId());
        System.out.println("First Name is: " + e1.getFirstName());
        System.out.println("Last Name is: " + e1.getLastName());
        System.out.println("Salary is: " + e1.getSalary());

        System.out.println("Name is: " + e1.getName());
        System.out.println("Annual salary is: " + e1.getAnnualSalary());

        System.out.println(e1.raiseSalary(5));
        System.out.println(e1);

    }

}
