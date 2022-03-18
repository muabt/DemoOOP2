package hcn;
public class HinhChuNhat {
    double chieuDai;
    double chieuRong;

    public HinhChuNhat(){

    }
    public HinhChuNhat(double chieuDai, double chieuRong){
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    double chuVi(){
        return (chieuRong+ chieuDai)*2;
    }
    double dienTich(){
        return chieuDai * chieuRong;
    }
}