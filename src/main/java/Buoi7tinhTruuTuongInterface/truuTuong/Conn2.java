package Buoi7tinhTruuTuongInterface.truuTuong;

public class Conn2 extends Cha implements HanhViMe {

    public Conn2() {
    }

    public Conn2(String hoTen, int tuoi) {
        super(hoTen, tuoi);
    }

    @Override
    public String nauAn() {
        return "Nấu ăn ngon";
//        System.out.println("Nấu ăn ngon như mẹ");
    }

    @Override
    public void choiNhacCu() {
        System.out.println("Biết chơi piano");
    }

}