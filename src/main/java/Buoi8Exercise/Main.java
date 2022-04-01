package Buoi8Exercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KhuPho kp = new KhuPho();
        System.out.println("Xin mời nhập thông tin khu phố: ");
        kp.nhapDanhSach(sc);
        kp.hienThiDanhSach();

    }
}
