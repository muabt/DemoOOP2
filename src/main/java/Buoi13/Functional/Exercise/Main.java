package Buoi13.Functional.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static double inSinhVien(Function<List<Student>, Double> fn, List<Student> lstStudent){
        return fn.apply(lstStudent);
    }

    public static void inString(Predicate<Student> predicate, Student students) {
            if (predicate.test(students)) {
                System.out.println(students);
            }

    }
    public static void main(String[] args) {
        //1. In ra tuổi trung bình của các sinh viên trong danh sách.
        List<Student> lstStudent = new ArrayList<>();
        lstStudent.add(new Student(1, "Mua",18,"Nữ",10));
        lstStudent.add(new Student(2, "Hue",19,"Nữ",20));
        lstStudent.add(new Student(3, "May",20,"Nữ",60));
        //Viết các thông thường
        double ageTB = inSinhVien(new Function<List<Student>, Double>() {

            @Override
            public Double apply(List<Student> students) {
                double sum=0, ageTB = 0;

                for(int i=0;i<students.size();i++){
                    sum = Double.sum(students.get(i).getMark(),sum);
                }
                ageTB = sum/(students.size());
                return ageTB;
            }
        },lstStudent);
        System.out.println(ageTB);

        //Viết theo Lambda
        inSinhVien((fn)-> {
                double sum=0;
                double ageTB1 = 0.0;

                for(int i=0;i<fn.size();i++){
                    sum = Double.sum(fn.get(i).getMark(),sum);
                }
                ageTB1 = sum/(fn.size());
                 System.out.println(fn);
                return ageTB1;

        },lstStudent);


        //2. In ra điểm số cao nhất
        inSinhVien((fn) -> {
            double maxMark = fn.get(0).getMark();
            for (int i = 0; i < fn.size(); i++) {
                if (maxMark < fn.get(i).getMark()) {
                    maxMark = fn.get(i).getMark();
                }
            }
            System.out.println(maxMark);
            return maxMark;
        },lstStudent);

        //3. In ra điểm số thấp nhất
        inSinhVien((fn) -> {
            double minMark = fn.get(0).getMark();
            for (int i = 0; i < fn.size(); i++) {
                if (minMark > fn.get(i).getMark()) {
                    minMark = fn.get(i).getMark();
                }
            }
            System.out.println(minMark);
            return minMark;
        },lstStudent);

        //4. In ra điểm số phổ biến nhất

        //Sử dụng Predicate:
        //5. In ra thông tin của những người có tuổi lớn hơn 19.
        System.out.println("Danh sach sinh vien co tuoi > 19 la: ");
        for (Student stu : lstStudent) {
            inString ((predicate) -> {
                if(stu.getAge()>19) return true;
                return false;

            },stu);
        }
        //6. In ra thông tin các nữ sinh viên.
        System.out.println("Danh sach sinh vien la nu ");
        for (Student stu : lstStudent) {
            inString ((predicate) -> {
                if(stu.getGender() == "Nu") return true;
                return false;

            },stu);
        }
        //7. In ra thông tin những bạn điểm dưới < 50.
        System.out.println("Danh sach sinh vien co diem <50");
        for (Student stu : lstStudent) {
            inString ((predicate) -> {
                if(stu.getMark() <50) return true;
                return false;

            },stu);
        }

    }
}
