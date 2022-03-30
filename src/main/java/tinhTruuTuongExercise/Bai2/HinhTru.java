package tinhTruuTuongExercise.Bai2;

public class HinhTru extends HinhTron implements HinhHoc3D{
    protected double chieuCao;

    public double getChieuCao() {
        return chieuCao;
    }


    public HinhTru(double banKinh, double chieuCao) {
        super(banKinh);
        this.chieuCao = chieuCao;
    }

    @Override
    public double tinhTheTich() {
        return chieuCao*super.tinhTheTich();
    }
}
