package ravi;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int reverse = 0;

        while (n > 0){
            int rem = n % 10;
            reverse = reverse * 10 + rem;
            n /= 10;
        }

        System.out.println(reverse);
    }
}
