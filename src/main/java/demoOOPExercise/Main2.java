package demoOOPExercise;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien sv1 = new SinhVien();
        sv1.setMaSV(1);
        sv1.setHoTen("Mua");
        sv1.setDiemLT(7.5F);
        sv1.setDiemTH(8);

        SinhVien sv2 = new SinhVien();
        sv2.setMaSV(2);
        sv2.setHoTen("Hoa");
        sv2.setDiemLT(9);
        sv2.setDiemTH(8.5F);

        SinhVien sv3 = new SinhVien();
        System.out.println("Nhập mã sinh viên 3: ");
        sv3.setMaSV(sc.nextInt());sc.nextLine();
        System.out.println("Nhập tên sinh viên 3: ");
        sv3.setHoTen(sc.nextLine());
        System.out.println("Nhập điểm lý thuyết");
        sv3.setDiemLT(sc.nextFloat());
        System.out.println("Nhập điểm thực hành");
        sv3.setDiemTH(sc.nextFloat());

        System.out.printf("%6s %10s %20s %10s %10s \n", " Mã SV", "Họ tên", "Điểm LT", "Điểm TH", "Điểm TB");
        sv1.inSV();
        sv2.inSV();
        sv3.inSV();



    }

}
