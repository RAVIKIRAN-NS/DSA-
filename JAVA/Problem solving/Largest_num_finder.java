package ravi;

import java.util.Scanner;

public class Largest_num_finder {
    public static void main(String[] args) {
        Scanner largest = new Scanner(System.in);
        int a = largest.nextInt();
        int b = largest.nextInt();
        int c = largest.nextInt();

        int max = a;
        if (b > max){
            max = b;
        }
        if (c > max) {
            max = c;
        }

        System.out.println(max);

        System.out.println(Math.max(c,Math.max(12,23)));
    }
}
