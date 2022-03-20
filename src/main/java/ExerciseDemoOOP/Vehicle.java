package ExerciseDemoOOP;

public class Vehicle {
    //Attributes
    private int maXe, dungTich;
    private double triGia;
    private String chuXe, moTa;

    //Constructor
    public Vehicle(){

    }
    public Vehicle(int maXe, String chuXe, int dungTich, double triGia, String moTa){
        this.maXe = maXe;
        this.chuXe = chuXe;
        this.dungTich = dungTich;
        this.triGia = triGia;
        this.moTa = moTa;
    }

    public int getMaXe() {
        return maXe;
    }

    public void setMaXe(int maXe) {
        this.maXe = maXe;
    }

    public String getChuXe() {
        return chuXe;
    }

    public void setChuXe(String chuXe) {
        this.chuXe = chuXe;
    }
    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public double getTriGia() {
        return triGia;
    }

    public void setTriGia(double triGia) {
        this.triGia = triGia;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
    public double tinhThue(){
        double thue;
        if(dungTich <100)
            thue = triGia*0.01;
        else if(dungTich >=100 && dungTich <=200)
            thue = triGia*0.03;
        else thue = triGia*0.05;
        return thue;
    }
    public String toString(){
        return maXe + "-"+chuXe + "-"+dungTich + "-"+triGia + "-"+moTa;
    }
    void inThue(){
        System.out.printf("%5d %-20s %5d %10.2f %10s %8.5f",maXe,chuXe,dungTich,triGia,moTa,tinhThue());
    }
}
