package Buoi4;

public class Student {
    //Thuộc tinh
    int id;
    String name;
    boolean gender;

    //Phương thức khởi tạo construtor: alt +insert
    public Student(){

    }

    public Student(int id, String name, boolean gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}
