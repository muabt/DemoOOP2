package Buoi10Generic.Example;

public class Main {
    public static void main(String[] args) {
        //Box 1 lưu từ điển anh việt
        KeyValue<String, String>[] tuDien = new KeyValue[100];
        tuDien[0] = new KeyValue("Hello", "Xin chao");
        tuDien[1] = new KeyValue("Bye", "Tam biet");

        //duyet tu dien va in ra
        for(KeyValue item: tuDien){
            if(item == null) break;
            System.out.println(item);

        }
        //
        KeyValue<String,String[]> t = new KeyValue<>();
        t.setKey("Hello");
        t.setValue(new String[]{"chao", "xin chao"});
        System.out.println(t);
        ComputerAndIP c1 = new ComputerAndIP();
        c1.setKey("PC1");
        c1.setValue(new String[]{"192.168.1.0","192.168.1.3"});
        System.out.println(c1);
    }
}
