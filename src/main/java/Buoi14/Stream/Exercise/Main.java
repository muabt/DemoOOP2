package Buoi14.Stream.Exercise;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Faker tạo 1000 đối tượng Human
        Faker faker = new Faker(new Locale("vi", "VN"));
        List<Human> humanList = new ArrayList<>();
        for (int i=0; i<1000; i++){
            Human h = new Human();
            h.setId(i);
            h.setFirstName(faker.name().firstName());
            h.setLastName(faker.name().lastName());
            h.setCity(faker.address().city());
            h.setGender(faker.number().numberBetween(0,2));
            h.setAge(faker.number().numberBetween(10,51));
            h.getSalary(faker.number().numberBetween(10,3001));
            humanList.add(h);
        }
        System.out.println(humanList);

        //Thực hiện
        //1. Có bao nhiêu nam trên 18 tuổi
        long soNam = humanList.stream()
                .filter(h->h.getGender()==1)
                .filter(h->h.getAge() > 18)
                .count();
        System.out.println("Số nam trên 18 tuổi: " +soNam);

        //2. Có bao nhiêu nữ có tên đệm "thị"
        long soNu = humanList.stream()
                .filter(h->h.getGender()==0)
                .filter(h->h.getLastName().contains("thị"))
                .count();
        System.out.println("Số nữ có tên đệm thị là :" +soNu);

     /*   //3. Lọc ra những người họ "Nguyễn" và sắp xếp theo thứ tự chữ cái
        Map<String, List<Human>> map = humanList.stream()
                .collect(Collectors.groupingBy(h->h.getLastName().contains("Nguyen")));
        for(Map.Entry<String, List<Human>> entry: map.entrySet()){
            System.out.println("Danh sách họ Nguyễn" + entry.getKey());
            System.out.println(entry.getValue());
        }*/


    }
}
