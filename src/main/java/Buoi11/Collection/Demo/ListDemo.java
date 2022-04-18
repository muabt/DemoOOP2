package Buoi11.Collection.Demo;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        //Làm việc với ArrayList

        //VD: Tạo ra mảng lưu trữ String-> có 2 cách
        //c1: Tạo mảng thông thường\
        String[] arrString = new String[30];
        //Gán giá trị cho các phần tử
        arrString[0] = "Hello";
        arrString[1] = "Java";
        //Nhược điểm: kích thước cố định, có lúc thiếu có lúc thừa

        //Làm việc với mảng động: không cần khai báo kích thước ban đầu
        ArrayList<String> arrayList = new ArrayList<>();

        //Thêm phần tử: method add
        arrayList.add("Hello");
        arrayList.add("Java");
        arrayList.add("Collection");

        //In ra list
        System.out.println(arrayList);

        //Cập nhật giá trị 1 phần tử: set
        arrayList.set(0, "Hi");
        System.out.println(arrayList);

        //Xóa phần tử: remove
        arrayList.remove(1);
        System.out.println(arrayList);

        //Xóa object: cần biến tham chiếu đến object đấy
        String element = "Test";
        arrayList.add(element);

        System.out.println(arrayList);
        //Xóa theo đối tượng
        arrayList.remove(element);
        System.out.println(arrayList);

        //Sắp xếp
        Collections.sort(arrayList);
        System.out.println(arrayList);

        //VD: Tạo 1 arrayList lưu trữ số thực, thêm ngẫu nhiên 10 các phần tử và sắp xếp theo thứ tự
        //từ bé đến lớn
        //tự nhập
        ArrayList<Double> arrayList1 = new ArrayList<>();
        arrayList1.add(10.3);
        arrayList1.add(15.2);
        arrayList1.add(12.5);
        arrayList1.add(10.8);
        arrayList1.add(18.9);
        arrayList1.add(17.8);
        arrayList1.add(30.4);
        arrayList1.add(20.5);
        arrayList1.add(39.0);
        arrayList1.add(60.7);

        //random
        for (int i = 0; i < 10; i++){
            arrayList1.add(new Random().nextDouble());
        }

        System.out.println(arrayList1);
        Collections.sort(arrayList1);
        System.out.println(arrayList1);
        Collections.reverse(arrayList1);
        System.out.println(arrayList1);










    }
}
