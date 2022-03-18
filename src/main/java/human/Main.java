package human;

public class Main {
    public static void main(String[] args) {
    //Tạo ra 1 đối tượng nhân viên
        NhanVien nv1 = new NhanVien();
        nv1.hoTen = "Nam";
        nv1.gioiTinh = "Nam";
        nv1.namSinh = 2000;
        System.out.println(nv1.getHoTen());

        NhanVien nv2 = new NhanVien();
        nv2.hoTen = "Nữ";
        nv2.gioiTinh = "Nữ";
        nv2.namSinh = 2001;
        System.out.println(nv2.getHoTen() + "-" +nv2.getTuoi() + " tuổi");

        //Tạo 1 nhân viên 3, có thuộc tính ngay lúc khởi tạo
        NhanVien nv3 = new NhanVien("Nguyen Van A", "Nam", 1999);
        System.out.println(nv3.getHoTen());
    }
}
