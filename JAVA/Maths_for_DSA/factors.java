package ravi.adv_maths;

import java.util.ArrayList;
import java.util.Arrays;

public class factors {
    public static void main(String[] args) {
        int n = 20;
        factor_3(n);
    }
    static void factor_1(int num){
        for (int i = 1;i <= num;i++){
            if (num % i == 0){
                System.out.print(i + " ");
            }
        }
    }
    static void factor_2(int num){
        for (int i = 1;i <= Math.sqrt(num);i++){
            if (num % i ==0){
                System.out.print(" "+i+" "+num/i);
            }
        }
    }
    static void factor_3(int num){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1;i <= Math.sqrt(num);i++) {
            if (num % i == 0) {
                if (num / i == i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " " );
                    list.add(num/i);
                }
            }
        }
        for (int i = list.size()-1;i >= 0; i--){
            System.out.print(list.get(i) + " ");
        }

    }

}
