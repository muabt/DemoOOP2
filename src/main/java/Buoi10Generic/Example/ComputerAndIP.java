package Buoi10Generic.Example;

import java.util.Arrays;

public class ComputerAndIP  extends KeyValue<String, String[]>{
    @Override
    public String toString(){
        return String.format("Computer[%s,IP=%s]", super.getKey(), Arrays.toString(super.getValue()));
    }
}
