package Buoi5tinhKeThua;

public class Main {
    public static void main(String[] args) {
        //Tạo 2 đối tượng
        Cha cha = new Cha("Cha", 1980);
        Conn con = new Conn("Con trai", 2005, "da vàng");
        con.an();
        con.ngu();

        //Con kế thừa các thuộc tính, phương thức lớp cha
        //Ép kiểu dữ liệu?
        Cha cha1 = new Conn("Con gái", 2008, "trắng");

        Conn conn1 = (Conn) cha1;
        System.out.println(conn1.getMauDa());

        //Quản lý thư viện: Base TaiLieu, Sach extends TaiLieu, Bao extends TaiLieu
        //Không biết lưu sách bao nhiêu, báo là bao nhiêu
        //ArrayList<TaiLieu> có thể lưu sách hoặc báo

        //ArrayList<Sach>, ArrayList<Bao>

    }
}
