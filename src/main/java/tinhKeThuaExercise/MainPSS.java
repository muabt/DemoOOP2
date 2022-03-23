package tinhKeThuaExercise;

public class MainPSS {
    public static void main(String[] args) {
        Person p = new Person("Mua", "OneMount");
        System.out.println(p.toString());

        Student s = new Student("Dai hoc",2003, 3.5);
        System.out.println(s.toString() + s.getProgram() + 2003 + s.getFee());

      /*  Staff sf = new Staff("Vinschool", 50.5);
        System.out.println(sf.toString() + sf.getSchool() + sf.getPay());*/
    }
}
