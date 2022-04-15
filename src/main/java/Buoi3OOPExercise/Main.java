package Buoi3OOPExercise;

public class Main {
    public static void main(String[] args) {
        HinhChuNhat2 hcn2 = new HinhChuNhat2();
        hcn2.nhap();
        System.out.printf("Chu vi: %.2f cm, diện tích %.2f cm2 \n", hcn2.chuVi(), hcn2.dienTich());
    }
}
