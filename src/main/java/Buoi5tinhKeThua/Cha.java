package Buoi5tinhKeThua;

public class Cha {
    private String hoTen;
    private int namSinh;

    //Constructor: phương thức tạo ra đối tượng


    public Cha() {

    }

    public Cha(String hoTen, int namSinh) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }
    public void an(){
        System.out.println("Cha-Ăn uống khỏe mạnh");
    }
    public void ngu(){
        System.out.println("Cha-Cấn ngủ nghỉ đầy đủ");
    }
}
