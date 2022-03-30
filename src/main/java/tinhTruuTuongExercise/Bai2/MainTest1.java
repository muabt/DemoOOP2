package tinhTruuTuongExercise.Bai2;

public class MainTest1 {
    public static void main(String[] args) {
        HinhBinhHanh hbh = new HinhBinhHanh(3,5,6);
        System.out.println("Chu vi hình bình hành = " + hbh.tinhChuVi());
        System.out.println("Dien tich hình bình hành = " + hbh.tinhDienTich());
        System.out.println("----------------------------");
        HinhChuNhat hcn = new HinhChuNhat(4,3);
        System.out.println("Chu vi hình chữ nhật = " + hcn.tinhChuVi());
        System.out.println("----------------------------");
        HinhTron htron = new HinhTron(6);
        System.out.println("Diện tích hình tròn = " + htron.tinhTheTich());
        System.out.println("----------------------------");
        HinhTru htru = new HinhTru(6, 9);
        System.out.println("Thể tích hình trụ = " + htru.tinhTheTich());



    }
}
