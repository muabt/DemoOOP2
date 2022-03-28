package tinhKeThuaExercise.bai3;

import java.util.List;
import java.util.Locale;

public class ThuVien <T extends TaiLieu>{
    public ThuVien() {

    }

    public static enum LoaiTaiLieu {
        SACH, BAO, TAPCHI
    }
    private List<T> listTaiLieu;

    public ThuVien(List<T> listTaiLieu) {
        this.listTaiLieu = listTaiLieu;
    }

    public int nhapTaiLieu(T tailieu){
       this.listTaiLieu.add(tailieu);
       return this.listTaiLieu.size()-1;
    }

    public void hienThiTaiLieu(){
        for (T t: listTaiLieu){
            System.out.println(t);
        }
    }

    public void hienThiThongTinTaiLieu(String maTaiLieu){
        boolean flag = false;
        for (T t: listTaiLieu){
            if(t.getMaTaiLieu().equals(maTaiLieu)){
                System.out.println(t);
                flag = true;
                break;
            }
        }
        if(!flag)
            System.out.println("Khong thay tai lieu");
    }

    public void hienThiTaiLieuTheoLoai(LoaiTaiLieu loai){
        String className = loai.name().toLowerCase(Locale.ROOT);
        int count = 0;
        for (T tailieu: listTaiLieu){
            if(tailieu.getClass().getSimpleName().toLowerCase(Locale.ROOT).equals(className)){
                System.out.println(tailieu);
                count ++;
            }
        }
        if(count==0){
            System.out.println("Khong co tai lieu: " + loai.toString());
        }

    }


}
