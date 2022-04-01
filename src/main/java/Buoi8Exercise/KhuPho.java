package Buoi8Exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class KhuPho {
    String tenPhuPho;
    private ArrayList<HoDan> dshd;

    public KhuPho() {
        dshd = new ArrayList<HoDan>(6);
    }

    public void themHoDan(HoDan hoDan) {
        dshd.add(hoDan);
    }
    public void nhapDanhSach(Scanner sc) {
        HoDan hoDan;

        System.out.print("Nhập vào số hộ dân: ");
        int soHoDan = sc.nextInt();
        sc.nextLine();

        System.out.println("Nhập vào thông tin cho từng hộ dân:");
        for (int i = 0; i < soHoDan; i++) {
            System.out.println("Hộ dân thứ: " + (i + 1) + " là:");
            hoDan = new HoDan();
            hoDan.nhapThongTin(sc);
            themHoDan(hoDan);
        }
    }
     public void hienThiDanhSach() {
        int n = dshd.size();

        for (int i = 0; i < n; i++) {
            System.out.println("Hộ dân thứ: " + (i + 1) + " là:");
            dshd.get(i).hienThiThongTin();
        }
    }
}
