package tinhKeThuaExample;

public class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;

    //Nếu ko khai báo thì sẽ có 1 constructor mặc định -> rỗng

    //Nếu có 2 construtor: rỗng, có tham số, thì phải có cả 2

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public double getChuVi(){
        return (chieuDai + chieuRong) * 2;
    }
    public double getDienTich(){
        return chieuDai * chieuRong;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"[" +
                "chieuDai=" + chieuDai +
                ", chieuRong=" + chieuRong +
                ", chuVi="+getChuVi()+
                ", dienTich="+ getDienTich()+
                ']';
    }
}