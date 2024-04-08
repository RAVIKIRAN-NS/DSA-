package ravi;

import java.util.Arrays;
import java.util.Scanner;

public class Array_inputs {
    public static void main(String[] args) {
        Scanner arr_ = new Scanner(System.in);
        int[] num = new int[5];
//        num[0] = 123;
//        num[1] = 213;
//        num[2] = 231;
//        num[3] = 1213;
//        num[4] = 2131;
        for (int i = 0;i < num.length;i++){
            num[i] = arr_.nextInt();
        }

//        for (int i = 0;i<num.length;i++){
//            System.out.print(num[i] + " ");
//        }

        for (int j : num) {
            System.out.print(j + " ");
        }


        // reverse in for loop for given input
        String[] str = new String[5];
        for (int i = str.length- 1; i >= 0; i--){
            str[i] = arr_.next();
        }
        System.out.println(Arrays.toString(str));

    }
}
