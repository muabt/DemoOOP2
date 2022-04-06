package Buoi9.Exception;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        //Nhập số thực a/b-> nếu b=0 chủ động ném ra 1 exception?
        double a, b;
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập a, b");
        a = Double.parseDouble(in.next());
        b = Double.parseDouble(in.next());
        in.close();

        try {
//           if(connection == null) {
//                throw new Exception("Lỗi hệ thống");
//            }
            if(b==0) throw new MyException();
            double t =a/b;
            System.out.println("Thương: " + t);
        }
        catch (MyException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
