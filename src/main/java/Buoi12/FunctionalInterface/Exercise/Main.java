package Buoi12.FunctionalInterface.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    @FunctionalInterface
    interface XuLyChuoi {
        int operator(String str);
    }

    public static void main(String[] args) {
        //1. Đếm số kí tự của chuỗi.
        XuLyChuoi demKiTu = (str) -> {
            return str.length();
        };
        System.out.println("Số kí tự của chuỗi là: " + demKiTu.operator("Xin chào buổi sáng"));

        //2. Tính số từ trong chuỗi.
        XuLyChuoi demTu = (str) -> {
            if(str == null){
                return -1;
            }
            int count = 0;
            int size = str.length();
            boolean notCount = true;
            for (int i = 0; i< size; i++){
                if(str.charAt(i)!= ' ' &&str.charAt(i) !='\t' && str.charAt(i) != '\n'){
                    if(notCount){
                        count++;
                        notCount = false;
                    }
                }else{
                    notCount = true;
                }
            } return count;
        };
        System.out.println("Số từ của chuỗi là: " + demTu.operator(" Xin  chào buổi      tối các bạn"));

        //3. Đếm số từ 'a','A' trong chuỗi
        XuLyChuoi soTuA = (str) -> {
            int count = 0;
            char array[] = new char[str.length()];
            for (int i = 0; i < str.length(); i++) {
                array[i] = str.charAt(i);
                if (array[i] == 'a' || array[i] == 'A')
                    count++;
                return count;
            }
        };
            System.out.println("Số từ chứ kí từ a và A là: " + soTuA.operator("Anh ơi anh ở lại anh nhé!"));

            //4. Đếm số kí tự được sử dụng trong chuỗi


    }
}


