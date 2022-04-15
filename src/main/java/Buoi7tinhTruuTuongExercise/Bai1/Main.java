package Buoi7tinhTruuTuongExercise.Bai1;

public class Main {
    public static void main(String[] args) {
        GeometricObject geomObj1 = new Circle(5.0);
        System.out.println(geomObj1);
        System.out.println("Perimeter = " + geomObj1.getPerimeter());
        System.out.println("Area = " + geomObj1.getArea());
        System.out.println("-----------------------------------");

        Resizable geomObj2 = new ResizableCircle(7.0);
        System.out.println(geomObj2);
        geomObj2.resize(50);
        System.out.println(geomObj2);
    }
}
