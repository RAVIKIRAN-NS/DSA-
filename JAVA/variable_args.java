package ravi;

import java.util.Arrays;

public class variable_args {
    public static void main(String[] args) {
      fun(2,3,1,0,1,0,1,0,1);
    }
    static void fun(int a,int b,int...v){
        System.out.println(Arrays.toString(v));
    }
}
