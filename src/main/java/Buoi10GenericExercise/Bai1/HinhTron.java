package Buoi10GenericExercise.Bai1;

public class HinhTron {
    private int radius;

    public HinhTron() {
    }

    public HinhTron(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double tinhChuVi(){
        return 2*Math.PI*radius;
    }
    public double tinhDienTich(){
        return radius*Math.PI*radius;
    }

    @Override
    public String toString() {
        return " HinhTron[" +
                "radius=" + radius +
                ']';
    }
}
