package Buoi10GenericExercise.Bai1;

public class Drawable {

    public <T extends IHinhHoc> void draw(T t) {
        System.out.println(t.toString());
    }
}