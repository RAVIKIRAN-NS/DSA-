package ravi;

import java.util.Arrays;

public class method_overloading {
    public static void main(String[] args) {
        sum(1,1,"ravi","kiran");
        sum(1,1,2,3,4,5,6,7);
//        sum();
    }
    static void sum(int a , int b,int...v){
        int sum = a + b;
        System.out.print(sum);
        System.out.println(Arrays.toString(v));
    }
    static void sum(int a , int b,String...v){
        int sum = a + b;
        System.out.print(sum);
        System.out.println(Arrays.toString(v));
    }
}
