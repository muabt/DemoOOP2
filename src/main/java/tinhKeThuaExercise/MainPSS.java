package tinhKeThuaExercise;

public class MainPSS {
    public static void main(String[] args) {
        Person p = new Person("Mua", "OneMount");
        System.out.println(p.toString());

        Student s = new Student("Lam", "Ha Noi", "Mam non", 2016, 8.0);
        System.out.println(s.toString());


        Staff sf = new Staff("Bach", "Bac Ninh", "Vinschool", 50.5);
        System.out.println(sf.toString());
    }
}
