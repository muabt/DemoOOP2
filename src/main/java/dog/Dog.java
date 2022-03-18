package dog;

public class Dog {
    //Thuộc tính của lớp - biến
    String breed;
    String size;
    int age;
    String color;

    //Hành vi - phương thức (method, function)
    void eat(){
        System.out.println("Chó " +breed+  " là động vật ăn tạp");
    }
    void run(){
        System.out.println("Chó " + breed + " chạy nhanh");
    }
    void sleep(){
        System.out.println("Zzzz");
    }
}
