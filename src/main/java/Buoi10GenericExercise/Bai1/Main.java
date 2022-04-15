package Buoi10GenericExercise.Bai1;

public class Main {
    public static void main(String[] args) {
        Drawable hinhTron = new Drawable<>();
        hinhTron.setT(new HinhTron(8));
        hinhTron.draw();

        Drawable hinhVuong = new Drawable<>();
        hinhVuong.setT(new HinhVuong(12));
        hinhVuong.draw();
    }
}
