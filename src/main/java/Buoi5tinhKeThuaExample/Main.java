package Buoi5tinhKeThuaExample;

public class Main {
    public static void main(String[] args) {
        HinhChuNhat hcn = new HinhChuNhat(3, 4);
        // Ngầm định gọi đến toString() luôn
        System.out.println(hcn.toString());
        HinhVuong hv = new HinhVuong(4);
        System.out.println(hv.toString());

        //Mặc định tất cả các class sẽ được kế thừa siêu cha Object


        //Mở rộng: Nhập vào 1 dánh sách hình vuông, hình chữ nhật. In ra thông tin của từng hình
        //Khởi tạo 1 mảng: 3 đối tượng ->
        HinhChuNhat[] arr = new HinhChuNhat[3];
        arr[0] = new HinhVuong(4);
        arr[1] = new HinhChuNhat(3,5);
        arr[2] = new HinhVuong(6);

        System.out.println("\n------------------------\n");
        for(HinhChuNhat item: arr){
            //Ngầm định gọi đến toString() luôn
            System.out.println(item);
        }

    }
}
