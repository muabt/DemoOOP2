package Buoi8Exercise;

import java.util.Scanner;

public class ThanhVien {
    private String hoTen;
    private int tuoi;
    private String ngheNghiep;
    private int soCCCD;

    public ThanhVien() {
    }

    public ThanhVien(String hoTen, int tuoi, String ngheNghiep, int soCCCD) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.ngheNghiep = ngheNghiep;
        this.soCCCD = soCCCD;
    }

    //Nhập thông tin từng người trong hộ gia đình
    public void nhapThongTin(Scanner sc){
        System.out.println("Nhập họ tên: ");
        this.hoTen = sc.nextLine();
        System.out.println("Nhập tuổi: ");
        this.tuoi = sc.nextInt();sc.nextLine();
        System.out.println("Nhập nghề nghiệp: ");
        this.ngheNghiep = sc.nextLine();
        System.out.println("Nhập số CCCD: ");
        this.soCCCD = sc.nextInt();sc.nextLine();
//        sc.close();

    }
    //Hiển thị thông tin từng người
    public void hienThiThongTin() {
        System.out.println("\tHo ten: " + hoTen);
        System.out.println("\tTuổi: " + tuoi);
        System.out.println("\tNghe nghiep: " + ngheNghiep);
        System.out.println("\tCCCD: " + soCCCD);
    }


}
