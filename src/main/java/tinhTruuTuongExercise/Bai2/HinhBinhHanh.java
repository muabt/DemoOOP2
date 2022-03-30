package tinhTruuTuongExercise.Bai2;

public class HinhBinhHanh implements HinhHoc2D{

    protected double canhDay;
    protected double canhBen;
    protected double chieuCao;

    public HinhBinhHanh(double canhDay, double canhBen) {
        this.canhDay = canhDay;
        this.canhBen = canhBen;
    }
    public HinhBinhHanh(double canhDay, double canhBen, double chieuCao) {
        this.canhDay = canhDay;
        this.canhBen = canhBen;
        this.chieuCao = chieuCao;
    }

    public double getCanhBen() {
        return canhBen;
    }

    public double getCanhDay() {
        return canhDay;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public double tinhChuVi(){
        return 2*(canhBen + canhDay);
    }
    public double tinhDienTich(){
        return chieuCao*canhDay;
    }
}
