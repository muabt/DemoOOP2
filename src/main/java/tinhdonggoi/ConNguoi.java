package tinhdonggoi;

public class ConNguoi {
    private String hoTen;
    //Không viết gì mặc định là default
    boolean gioiTinh;
    public int namSinh;

    //Constructor để default hoặc public
    public ConNguoi(String hoTen, boolean gioiTinh, int namSinh) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.namSinh = namSinh;
    }
    public void an(){
        System.out.println("Ăn thức ăn");
        //Gọi phương thức tiêu hóa?
        tieuHoa();
    }
    public void ngu(){
        System.out.println("Cần nghỉ ngơi");
    }
    public void choi(){
        System.out.println("Đi chơi, giải trí");
    }
    int tinhTuoi(){
        return 2022-namSinh;
    }
    public void wc(){
        System.out.println("Đi vệ sinh");
    }
    private void tieuHoa(){
        System.out.println("Tiêu hóa thức ăn");
    }
}
