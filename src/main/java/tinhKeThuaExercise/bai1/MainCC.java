package tinhKeThuaExercise.bai1;

public class MainCC {
    public static void main(String[] args) {
        Circle c1 = new Circle(3.0, "Yellow");
        System.out.printf("Diện tích: %.2f cm2\n", c1.getArea());
        System.out.println(c1);


        Cylinder c2 = new Cylinder(3.0, "Blue", 7.0);
        System.out.printf("Thể tích: %.2f cm3\n",c2.getVolume());

    }
}
