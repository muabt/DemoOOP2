package demoOOP;

import tinhdonggoi.ConNguoi;

public class Main {
    public static void main(String[] args) {
        Student sv = new Student(1,"Nguyen Van A", true);
        //Khi để default-> Thuộc tính có thể truy cập trực tiếp
        System.out.println(sv.getName());
        System.out.println(sv.name);

        ConNguoi cn = new ConNguoi("A", false, 2000);
        System.out.println(cn.namSinh);

    }
}
