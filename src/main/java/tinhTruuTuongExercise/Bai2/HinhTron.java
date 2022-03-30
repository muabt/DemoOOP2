package tinhTruuTuongExercise.Bai2;

public class HinhTron implements HinhHoc3D{
    protected double banKinh = 2.0;

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public double tinhTheTich() {
        return banKinh*banKinh*Math.PI;
    }
}
