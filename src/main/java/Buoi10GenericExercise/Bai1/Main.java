package Buoi10GenericExercise.Bai1;

public class Main {
    public static void main(String[] args) {
        Drawable drawable = new Drawable();
        HinhTron ht = new HinhTron(4);
        HinhVuong hv = new HinhVuong(8);

        drawable.draw(ht);
        drawable.draw(hv);
    }
}
