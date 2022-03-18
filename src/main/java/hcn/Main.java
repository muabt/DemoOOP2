package hcn;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //ArrayList
        ArrayList<HinhChuNhat> danhSach = new ArrayList<>();
        danhSach.add(new HinhChuNhat(3, 4));
        danhSach.add(new HinhChuNhat(7, 8));
        danhSach.add(new HinhChuNhat(8, 6));

        // In ra chu vi và diện tích từng hình
        for (HinhChuNhat hcn : danhSach) {
            System.out.printf("Chu vi: %.2f cm, diện tích %.2f cm2 \n", hcn.chuVi(), hcn.dienTich());
        }
    }
}
