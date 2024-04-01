package ravi;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        float a = num.nextFloat();
        float b = num.nextFloat();

        float sum = a + b;
        System.out.println("Sum = "+ sum);
    }
}
