package Buoi9Exercise;

import java.io.IOException;
import java.util.Scanner;

public class PhanSo {
    protected int tuSo;
    protected int mauSo;

    public PhanSo() {
    }

    public PhanSo(int tuSo, int mauSo) {
        super();
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public boolean kiemTraPhanSo(int tuSo, int mauSo) {
        if (mauSo == 0) {
            System.out.println("Mẫu số phải khác 0");
            return false;
        }
        try {
            Integer.parseInt(String.valueOf(tuSo));
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Bạn không được nhập chuỗi");
        }
        return true;
    }

        static int nhapgt () throw IOException{
            Scanner sc = new Scanner(System.in);
            String str;
            boolean flag = false;
            int so = 0;
            while (!flag) {
                try {
                    str = sc.nextLine();
                    so = Integer.valueOf(str).intValue();
                    flag = true;
                } catch (NumberFormatException e) {
                    System.out.println("Bạn phải nhập số nguyên. Mời nhập lại");
                }
            }
            return so;
        }
        static PhanSo nhapps(int x) throws IOException{
            int tu,mau;
            System.out.println("Nhap phan so thu: " +x);
            System.out.print("Tu so: ");
            tu=nhapgt();
            System.out.print("Mau so: ");
            do{
                mau=nhapgt();
                if(mau==0) System.out.print("Nhap lai mau so");
            }while(mau==0);
            PhanSo ps = new PhanSo(tu,mau);
            return ps;
        }

        static int UCLN( int a, int b){
            while (a != b) {
                if (a > b) {
                    a -= b;
                } else {
                    b -= a;
                }
            }
            return a;
        }

        static PhanSo toiGianPS(PhanSo ps){
            PhanSo phanso = new PhanSo();
            phanso.tuSo = ps.tuSo/UCLN(Math.abs(ps.tuSo),Math.abs(ps.mauSo));
            phanso.mauSo = ps.mauSo/UCLN(Math.abs(ps.tuSo),Math.abs(ps.mauSo));
            return phanso;
        }

        public void cong(PhanSo ps1, PhanSo ps2, PhanSo ps3){
            PhanSo phanso = new PhanSo();
            phanso.tuSo= ps1.tuSo*ps2.mauSo*ps3.mauSo + ps2.tuSo*ps1.mauSo*ps3.mauSo + ps3.tuSo*ps1.mauSo*ps2.mauSo;
            phanso.mauSo= ps1.mauSo*ps2.mauSo*ps3.mauSo;
            if(phanso.tuSo!=0)
                phanso=toiGianPS(phanso);
            return phanso;

        }
        @Override
        public void tru(PhanSo ps1, PhanSo ps2, PhanSo ps3){
            PhanSo phanso = new PhanSo();
            phanso.tuSo= ps1.tuSo*ps2.mauSo*ps3.mauSo - ps2.tuSo*ps1.mauSo*ps3.mauSo - ps3.tuSo*ps1.mauSo*ps2.mauSo;
            phanso.mauSo= ps1.mauSo*ps2.mauSo*ps3.mauSo;
            if(phanso.tuSo!=0)
                phanso=toiGianPS(phanso);
            return phanso;
        }

        @Override
        public void nhan(PhanSo ps1, PhanSo ps2){
            PhanSo phanso = new PhanSo();
            phanso.tuSo = ps1.tuSo*ps2.tuSo;
            phanso.mauSo = ps1.mauSo*ps2.mauSo;
            if(phanso.tuSo!=0)
                phanso = toiGianPS(phanso);
            return phanso;
        }

        @Override
        public void chia(PhanSo ps1, PhanSo ps2){
            PhanSo phanso = new PhanSo();
            phanso.tuSo = ps1.tuSo*ps2.tuSo;
            phanso.mauSo = ps1.mauSo*ps2.mauSo;
            if(phanso.tuSo!=0)
                phanso = toiGianPS(phanso);
            return phanso;
        }
        static void hienThi(PhanSo ps){
        if(ps.tuSo==0 || ps.mauSo==1) System.out.print(ps.tuSo);
        else {
            System.out.println(ps.tuSo+"/"+ps.mauSo );
            System.out.printf("\n");
        }
    }

    }

