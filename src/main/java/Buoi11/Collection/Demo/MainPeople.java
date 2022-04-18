package Buoi11.Collection.Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Sắp xếp theo điều kiện nào đó
//vd: cho danh sách người: id, họ tên, tuổi, giới tính...
//1. Sắp xếp theo họ tên: ABC...
//2. Sắp xếp theo tuổi
//3*. Sắp xếp chỉ theo tên (ko theo họ tên)

public class MainPeople {
    public static void main(String[] args) {
        List<Nguoi> nguoiList = new ArrayList<>();
        nguoiList.add(new Nguoi(1, "Nguyen Van A", 20));
        nguoiList.add(new Nguoi(2, "Do Van B", 21));
        nguoiList.add(new Nguoi(3, "Pham Van C", 25));
        System.out.println(nguoiList);
        //Sắp xếp theo ABC...
        Collections.sort(nguoiList, new Comparator<Nguoi>() {
            @Override
            public int compare(Nguoi o1, Nguoi o2) {
                //return 1 có nghĩa là lơn hơn
                //return 0 tức là bằng nhau (ko sắp xếp giữ nguyên vị trí)
                //return -1 tữ là bé hơn
                if(o1.hoTen.charAt(0) < o2.hoTen.charAt(0)) {
                    return -1;
                }else if(o1.hoTen.charAt(0) == o2.hoTen.charAt(0)) {
                    return 0;
                }
                return 1;
            }
        });
        System.out.println(nguoiList);

        //Sắp xếp theo tuổi
       Collections.sort(nguoiList, new Comparator<Nguoi>() {
           @Override
           public int compare(Nguoi o1, Nguoi o2) {
               if(o1.age < o2.age){
                   return -1;
               }else if(o1.age == o2.age){
                   return 0;
               }
               return 1;
           }
       });
        System.out.println(nguoiList);
    }
}
