package ravi.bitwise_operator;

import java.util.Scanner;

public class adv_even_or_odd {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = num.nextInt();
        System.out.println(isodd(n));
    }

    static String isodd(int num) {
        if ((num & 1) == 1){
            return "odd";
        }else {
            return "even";
        }
    }
}
