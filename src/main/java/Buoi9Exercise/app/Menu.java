package Buoi9Exercise.app;

import Buoi9Exercise.fraction.Calculator;
import Buoi9Exercise.fraction.IFraction;

import java.util.Scanner;

public class Menu {
        private static void showmenu(){
            System.out.println("------Menu-------");
            System.out.println("1. Tính tổng 3 phân số ");
            System.out.println("2. Tính hiệu 3 phân số ");
            System.out.println("3. Tính tích 2 phân số ");
            System.out.println("4. Tính thương 2 phân số");
            System.out.println("5. Lịch sử 5 phép tính gần nhất");
            System.out.println("6. Thoát");
            System.out.print("\nNhập lựa chọn: ");
            int input = 0;
            if(input!=1 && input!=2 && input!=3 && input!=4 && input!=5 && input!=6) {
                System.out.println("Mời bạn nhập lại. Bạn phải chọn các số từ 1 đến 6");
            }
        }

       /* public static void main(String[] args){
            int select = 0;
            Scanner in = new Scanner(System.in);
            do {
                showmenu();
                select = Integer.parseInt(in.nextLine());
                Calculator cal = new IFraction();
                switch (select) {
                    case 1:
                        cal.add();
                        break;
                    case 2:
                        cal.sub();
                        break;
                    case 3:
                        cal.mul();
                        break;
                    case 4:
                        cal.div();
                        break;
                    case 5:
                        System.out.println("5. Lịch sử 5 phép tính gần nhất");
                        break;
                    default:
                        System.out.println("Thoát");
                        break;
                }
            }
            while (select!=6);
            in.close();
        }*/
}


