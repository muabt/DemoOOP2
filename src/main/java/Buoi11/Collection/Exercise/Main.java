package Buoi11.Collection.Exercise;

import Buoi11.Collection.Demo.Nguoi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static void showMenu() {
        System.out.println("------Quan Ly Sinh Viên-------");
        System.out.println("1. Danh sách sinh viên( in ra danh sách toàn bộ sinh viên): ");
        System.out.println("2. Nhập thông tin sinh viên mới. (nhập dữ liệu từ bàn phím)");
        System.out.println("3. Tìm kiếm sinh viên theo ID (in ra chi tiết, nếu không có phải đưa thông báo)");
        System.out.println("4. Danh sách môn học.");
        System.out.println("5. Nhập thông tin môn học mới");
        System.out.println("6. Nhập điểm môn học cho sinh viên.(gợi ý: nhập mã sinhviên muốn nhập ->  chọn môn ->  nhậpđiểm)");
        System.out.println("7. Cập nhật điểm cho sinh viên.");
        System.out.println("8. Xem điểm sinh viên theo mã ID. (theo định dạng bên dưới)");
        System.out.println("9. In ra danh sách sinh viên theo cácmã môn học.");
        System.out.println("10. In ra sinh viên có điểm trung bìnhtất cảcác môncao nhất.");
        System.out.println("11. Thoát");
        System.out.print("\nNhập lựa chọn: ");
    }


    public static void main(String[] args) {
        int select = 0;
        Scanner sc = new Scanner(System.in);
        List<SinhVien> lstSV = new ArrayList<>();
        List<MonHoc> lstMonHoc = new ArrayList<>();
        List<Diem> lstDiemSV = new ArrayList<>();
        SinhVien sv1 = new SinhVien("1", "Bùi Mua", "7/2/1987", "Bắc Ninh");
        lstSV.add(sv1);
        lstMonHoc.add(new MonHoc("T", "Toán"));
        lstDiemSV.add(new Diem("1", "T", 10));
        do {
            showMenu();
            String maSinhVien;
            select = Integer.parseInt(sc.nextLine());
            switch (select) {
                case 1:
                    //1. In danh sách sinh viên ra màn hình.
                    System.out.println("In ra danh sach sinh vien");
                    for (SinhVien sv2 : lstSV) {
                        System.out.println(sv2.toString());
                    }
                    break;
                case 2:
                    //2. Thêm sinh viên vào danh sách.
                    System.out.println("Nhập mã sinh viên: "); maSinhVien = sc.nextLine();
                    System.out.println("Nhập họ và tên: "); String hoVaTen = sc.nextLine();
                    System.out.println("Nhập năm sinh: "); String ngaySinh = sc.nextLine();
                    System.out.println("Nhập quê quán: "); String queQuan = sc.nextLine();
                    SinhVien sv = new SinhVien(maSinhVien, hoVaTen, ngaySinh, queQuan);
                    lstSV.add(sv);
                    break;

                case 3:
                    //3. Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.
                    SinhVien sv3 = new SinhVien();
                    System.out.println("Nhập mã sinh viên cần tìm: ");
                    maSinhVien = sc.nextLine();
                    int count = 0;
                    for (int i = 0; i < lstSV.size(); i++){
                        if(maSinhVien == lstSV.get(i).getMaSV()){
                            sv3 = lstSV.get(i);
                            count +=count;

                        }
                    }
                    if(count ==0){
                        System.out.println("Khong tim thay sinh vien nao co mã sinh viên =" +maSinhVien);
                    }
                    else {
                        System.out.println("Sinh vien tim thay co mã sinh viên = " + maSinhVien);
                        sv3.toString();
                    }
                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:

                    break;
                case 10:

                    break;

                case 11:
                    System.out.println("Kết thúc");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
            }
        }
        while (select != 11);
        sc.close();
    }


}
