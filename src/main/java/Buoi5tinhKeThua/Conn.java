package Buoi5tinhKeThua;
//Kế thừa: extends
public class Conn extends Cha{
    private String mauDa;

    //Constructor:
    public Conn(){

    }

    public Conn(String hoTen, int namSinh, String mauDa) {
        //Gọi đến constructor của lớp cha
        super(hoTen, namSinh);
        this.mauDa = mauDa;
    }

    public String getMauDa() {
        return mauDa;
    }

    public void setMauDa(String mauDa) {
        this.mauDa = mauDa;
    }
    public void hoc(){
        System.out.println("Học hành chăm chỉ");
    }
    public void choi(){
        System.out.println("Thích chơi thể thao");
    }
}
