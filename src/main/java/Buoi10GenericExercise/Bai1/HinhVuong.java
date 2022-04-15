package Buoi10GenericExercise.Bai1;

public class HinhVuong implements IHinhHoc{
    private double canh;

    public HinhVuong() {
    }

    public HinhVuong(double canh) {
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }

    @Override
    public String toString() {
        return " HinhVuong[" +
                "canh =" + canh +
                ']';
    }
    public double tinhChuVi(){
        return canh*4;
    }
    public double tinhDienTich(){
        return canh*canh;
    }
}
