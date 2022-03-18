package human;

import java.util.Calendar;
import java.util.Date;

public class NhanVien {
    //Thuộc tính của lớp - biến
    String hoTen;
    String gioiTinh;
    int namSinh;

    //Constructor: phương thức khởi tạo
    public NhanVien(){

    }
    //Có tham số ngay lúc khởi tạo
    public NhanVien(String hoTen, String gioiTinh, int namSinh){
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
    }

    //Hành vi - phương thức (methods, function)
    String getHoTen() {
        if(gioiTinh.equals("Nam")) {
            return "Mr." + hoTen;
        }
        else
            return "Ms." +hoTen;
        }

  int getTuoi(){
        return Calendar.getInstance().get(Calendar.YEAR) - namSinh;
  }
    }
