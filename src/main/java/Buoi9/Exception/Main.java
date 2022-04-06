package Buoi9.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Nhập 2 số nguyên a, b từ bàn phím, sau đó tính thương a/b
        long a, b;
        Scanner in  = new Scanner(System.in);
        try {
            System.out.println("Enter a: ");
            a = in.nextLong();
            System.out.println("Enter b: ");
            b = in.nextLong();
            System.out.println("Div(a/b) = " + a / b);
        }
        catch (InputMismatchException e){
            System.out.println("Nhập sai định dạng!");
        }
        catch (ArithmeticException e){
            System.out.printf("Lỗi chia cho 0");
        }
        catch(Exception e){
            //VD: nếu nhập sai định dạng -> báo là hãy nhập dạng số?
            // nếu nhập b =0 -> báo ko thực hiện được phép chia?
            e.printStackTrace();
        }

        //Lỗi 1: Nhập sai định dạng
        //Lỗi 2: phép chia

    }
}
