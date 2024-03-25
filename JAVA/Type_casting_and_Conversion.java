package ravi;

import java.util.Scanner;

public class Type_casting_and_Conversion {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

//        int a = num.nextInt();
//        System.out.println(a);

        // type casting
//        int num1 = (int) (63.22f);
//        System.out.println(num1);

        // automatic type promotion
//        int a = 257;
//        byte b = (byte) (a);//257%256 = 1
//        System.out.println(b);

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = a * b / c;
//        System.out.println(d);

//        byte b = 50;
//        b = b * 2;// error, when we use operators it will cnvert it  to int value

//        int a = 'a';
//        System.out.println(a);

        byte b = 50;
        char c = 'c';
        int i = 10000;
        float f = 11.22f;
        double d = 123.44224;
        short s = 100;

        double result = (f * b) + (i / c) -(d * s);
        System.out.println((f * b)+" "+(i / c)+" "+(d * s));
        //                   float   +    int  +    double = double
        System.out.println(result);

    }
}
