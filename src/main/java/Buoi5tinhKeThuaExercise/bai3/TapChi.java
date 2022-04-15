package Buoi5tinhKeThuaExercise.bai3;

public class TapChi extends TaiLieu{
    private long soPhatHanh;

    public TapChi() {
    }

    public TapChi(String maTaiLieu, String tenNhaXuatBan, long soBanPhatHanh, long soPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
    }
    public long getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(long soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    @Override
    public String toString() {
        return "TapChi[" + super.toString() +
                ", soPhatHanh=" + soPhatHanh +
                ']';
    }
}
