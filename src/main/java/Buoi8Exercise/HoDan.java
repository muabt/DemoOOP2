package Buoi8Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class HoDan extends ThanhVien {
    private int soThanhVien;
    private int soNha;
    private ThanhVien[] list;

    public HoDan() {
        list = new ThanhVien[6];
    }

    public HoDan(String hoTen, int tuoi, String ngheNghiep, int soCCCD, int soNha, int soThanhVien) {
        super(hoTen, tuoi, ngheNghiep, soCCCD);
        this.soThanhVien = soThanhVien;
        this.soNha = soNha;
    }

    public void nhapThongTin(Scanner sc) {
        System.out.print("\tNhap so nguoi: ");
        soThanhVien = sc.nextInt();
        sc.nextLine();
        System.out.print("\tNhap so nha: ");
        soNha = sc.nextInt();
        sc.nextLine();
        System.out.println("\tNhap thong tin cho tung nguoi trong ho:");
        for (int i = 0; i < soThanhVien; i++) {
            System.out.println("Nguoi thu " + (i + 1) + " la:");
            list[i] = new ThanhVien();
            list[i].nhapThongTin(sc);
        }
    }
    public void hienThiThongTin() {
        System.out.println("\tSo nguoi: " + soThanhVien);
        System.out.println("\tSo nha: " + soNha);
        System.out.println("\tThong tin cua tung nguoi trong gia dinh:");
        for (int i = 0; i < soThanhVien; i++) {
            System.out.println("Nguoi thu " + (i + 1) + " la:");
            list[i].hienThiThongTin();
        }
    }
    public ThanhVien[] getList() {
        return list;
    }

    public int getSoNguoi() {
        return soThanhVien;
    }



}
