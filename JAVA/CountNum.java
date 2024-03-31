package ravi;

import java.util.Scanner;

public class CountNum {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int count = 0;

        while (n > 0){
            int rem = n % 10;
            if (rem == 5){
                count++;
            }
            n /= 10;
        }

        System.out.println(count);
    }
}
