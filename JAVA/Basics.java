package ravi;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
//        int a = 10;
//
//        if ( a== 10) {
//            System.out.println("Hello");
//
//        while( a != 15){
//            System.out.println("num: " + a);
//            a++;
//
//        }
//        }
//        for(int b = 12; b != 15;b++) {
//            System.out.println(b);}

        Scanner temp = new Scanner(System.in);
        System.out.print("Please enter Temp in celsius : ");
        float tempc = temp.nextFloat();
        float tempf = (tempc * 9/5) + 32;
        System.out.println(tempf);
    }
}
