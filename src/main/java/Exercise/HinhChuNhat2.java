package Exercise;

import java.util.Scanner;

public class HinhChuNhat2 {
    double chieuDai;
    double chieuRong;
    Scanner sc = new Scanner(System.in);

    public HinhChuNhat2(){

    }
    public HinhChuNhat2(double chieuDai, double chieuRong){
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    double chuVi(){
        return (chieuDai + chieuRong)*2;
    }
    double dienTich(){
        return chieuDai*chieuRong;
    }
    public void setChieuDai(double chieuDai){
        this.chieuDai = chieuDai;
    }
    public void setChieuRong(double chieuRong){
        this.chieuRong = chieuRong;
    }
    public double getChieuDai(){
        return chieuDai;
    }
    public double getChieuRong(){
        return chieuRong;
    }
    public String toString(){
        return chieuDai + " " + chieuRong;
    }

    public void nhap(){
        System.out.println("Nhập chiều dài hình chữ nhật: ");
        chieuDai = sc.nextDouble();
        System.out.println("Nhập chiều rộng hình chữ nhật: ");
        chieuRong = sc.nextDouble();
        sc.close();
    }


}
