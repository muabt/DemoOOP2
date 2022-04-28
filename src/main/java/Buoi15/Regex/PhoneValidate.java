package Buoi15.Regex;

import java.util.Scanner;

public class PhoneValidate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhoneValidate phoneCheck = new PhoneValidate();
        System.out.println("Nhập vào số điện thoại: ");
        String str = sc.nextLine();
        try{
           phoneCheck.checkPhone(str);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        sc.close();
    }
    public void checkPhone(String str) throws Exception {
        //Regex mô tả định dnagj số điện thoại
        String reg = "^(\\(?\\+84\\)?|0)([\\.\\-\\s])?(3[2-9]|8[6]|9[6-8])([0-9]|[\\.\\-\\s])[0-9|\\-\\s][0-9]{3}[\\.\\-\\s]?[0-9]{2}[0-9]?";
        boolean kt = str.matches(reg);
        if(kt==false){
            throw new Exception("Không đúng định dạng điện thoại!");
        }
        else {
            System.out.println("Đúng định dạng số điện thoại!");
        }
    }
}
