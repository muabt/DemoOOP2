package tinhDaHinh;

public class Son extends Father {
public Son(String name, int age){
    super(name,age);
}

//Ghi đè phương thức
    @Override
    public void play(){
        super.play();
        System.out.println("PLay basketball");
    }
    //Overload
    public void greeting(){
        System.out.println("Say hello");
    }
    public void greeting(String greeting){
        System.out.println(greeting);
    }
}
