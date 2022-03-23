package tinhKeThuaExercise;

public class MainCC {
    public static void main(String[] args) {
        Circle c1 = new Circle(3, "Vàng");
        System.out.println(c1.toString());


        Cylinder c2 = new Cylinder(3, 7);
        System.out.println("Cylinder:" + "radius=" + c2.getRadius() + ", "
                + "height=" + c2.getHeight() + ", "
                + "volume=" + c2.getVolume());

    }
}
