package ravi;

import java.util.Scanner;

public class Functioins_Or_Method {
    public static void main(String[] args) {
//        int sub = sub();
//        System.out.println("Subtraction : " + sub);
//        sum();
//        greeting();
        System.out.println(mul(1,2));
    }

    static  int mul(int num1, int num2){
        int sum = num1 * num2;
        return sum;
    }
    static int sub(){
        Scanner num =new Scanner(System.in);
        System.out.print("Enter the 1st num : ");
        int num1 = num.nextInt();
        System.out.print("Enter the 2nd num : ");
        int num2 = num.nextInt();
        int subtract = num1 - num2;
        return subtract;
    }
    static void sum(){
        Scanner num =new Scanner(System.in);
        System.out.print("Enter the 1st num : ");
        int num1 = num.nextInt();
        System.out.print("Enter the 2nd num : ");
        int num2 = num.nextInt();
        int sum = num1 +num2;
        System.out.println("Addition : " + sum);
    }
    static void greeting(){
        System.out.println("Hello world");
    }
}
