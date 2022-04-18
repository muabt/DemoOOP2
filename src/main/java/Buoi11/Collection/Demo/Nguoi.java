package Buoi11.Collection.Demo;

public class Nguoi {
    int id = 0;
    String hoTen;
    int age;

    public Nguoi(int id, String hoTen, int age) {
        this.id = id;
        this.hoTen = hoTen;
        this.age = age;
    }

    public Nguoi() {
    }

    @Override
    public String toString() {
        return "Nguoi[" +
                "id=" + id +
                ", hoTen='" + hoTen + '\'' +
                ", age=" + age +
                ']';
    }
}
