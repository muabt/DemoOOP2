package Buoi10GenericExercise.Bai1;

public class Drawable <T>{
    private T t;

    public Drawable() {
    }

    public Drawable(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
    public void draw(){
        System.out.println(" Vẽ ra" + t);
    }
}
