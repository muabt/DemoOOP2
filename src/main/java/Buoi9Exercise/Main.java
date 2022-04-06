package Buoi9Exercise;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Buoi9Exercise.PhanSo.hienThi;

public class Main {
    private static void showmenu() throws IOException{
        System.out.println("------Menu-------");
        System.out.println("1. Tính tổng 3 phân số ");
        System.out.println("2. Tính hiệu 3 phân số ");
        System.out.println("3. Tính tích 2 phân số ");
        System.out.println("4. Tính thương 2 phân số");
        System.out.println("5. Lịch sử 5 phép tính gần nhất");
        System.out.println("6. Thoát");
        System.out.print("\nNhập lựa chọn: ");
        int input;
        if(input!=1 && input!=2 && input!=3 && input!=4 && input!=5 && input!=6) {
            System.out.println("Mời bạn nhập lại. Bạn phải chọn các số từ 1 đến 6");
        }
    }

    public static void main(String[] args) throws IOException {
        int select = 0;
        Scanner in = new Scanner(System.in);
        PhanSo ps = new PhanSo();
        TinhToan tt = new TinhToan();
        do{
            showmenu();
            select = Integer.parseInt(in.nextLine());
            int tuSo, mauSo;
            PhanSo phanSo = new PhanSo();
            List<PhanSo> lstKQ = new ArrayList<PhanSo>();
            List<PhanSo> lstPS = new ArrayList<PhanSo>();
            List<PhanSo> lst2PS = new ArrayList<PhanSo>();
            List<PhanSo> lst3PS = new ArrayList<PhanSo>();
            for (int i=0;i<3;i++)
            {
                PhanSo ps = new PhanSo();
                ps =  PhanSo.nhapps(i);
                hienThi(ps);
                lstPS.add(ps);
            }
            System.out.println("Nhập số lượng phân số: ");
            int soLuong = Integer.parseInt(in.nextLine());
            for (int i =0; i <soLuong; i++){
                System.out.println("------------------------");
                System.out.println("Phân số thứ %d", i +1);
                System.out.println("Nhập tử số: ");
                System.out.println("Nhập mẫu số: ");
            switch (select){
                case 1:
                        PhanSo congPhanSo = tt.congPhanSo(lst3PS);
                        lstKQ.add(congPhanSo);
                        break;
                case 2:
                         PhanSo truPhanSo = tt.truPhanSo(lst3PS);
                         lstKQ.add(truPhanSo);
                         break;
                case 3:
                        PhanSo nhanPhanSo = tt.nhanPhanSo(lst3PS);
                        lstKQ.add(nhanPhanSo);
                        break;
                case 4:
                    PhanSo chiaPhanSo = tt.chiaPhanSo(lst3PS);
                    lstKQ.add(chiaPhanSo);
                    break;
                case 5:
                    System.out.println("Hiển thị 5 phép tính gần nhất");
                    break;
                case 6:
                    System.out.println("Kết thúc");
                    break;
                default:
                    System.out.println("Lựa chọn ko hợp lệ");
                    break;
            }
        }
    }while (select!=5);
        in.close();

}
