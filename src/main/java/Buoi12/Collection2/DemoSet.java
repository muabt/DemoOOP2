package Buoi12.Collection2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DemoSet {
    public static void main(String[] args) {
        //Tạo 1 đối tượng hashset
        HashSet<String> hashSet1 = new HashSet<>();
        //Set ko cho phép trùng lặp
        hashSet1.add("Hello");
        hashSet1.add("Hi");
        hashSet1.add("Hello");
        System.out.println(" Hashset 1: " + hashSet1);

        //Xóa bỏ 1 phần tử trong set
        /*hashSet1.remove("Hello");
        System.out.println(hashSet1);*/

        //Truy cập 1 phần tử -> Ko truy cập theo Index
      /*  List<String> arrList = new ArrayList<>();
        for (int i =0; i<arrList.size(); i++){
            System.out.println(arrList.get(i));

        }*/
        //Tạo hashset2
        HashSet<String> hashSet2 = new HashSet<>();
        hashSet2.add("Hello");
        hashSet2.add("Goodbye");
        hashSet2.add("Morning");

        System.out.println("Hashset 2: " +hashSet2);

        //Hợp Union -> 2 tập hợp
        HashSet<String> copyHashSet1 = (HashSet<String>) hashSet1.clone();
        copyHashSet1.addAll(hashSet2);
        System.out.println("Phép hợp: " + copyHashSet1);

        //Phép giao: chỉ gồm những phần tử chung
        copyHashSet1 = (HashSet<String>) hashSet1.clone();
        copyHashSet1.retainAll(hashSet2);
        System.out.println("Phép giao: " + copyHashSet1);

        //Phép trừ:
        copyHashSet1 = (HashSet<String>) hashSet1.clone();
        copyHashSet1.retainAll(hashSet2);
        System.out.println("Phép trừ: " + hashSet1);

    }
}
