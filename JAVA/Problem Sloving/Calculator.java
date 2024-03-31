package ravi;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner cal = new Scanner(System.in);
        int ans = 0;

        System.out.print("Enter the operator: ");
        char op = cal.next().trim().charAt(0);

        if (op == '+' || op == '-' || op == '*'|| op == '/' || op == '%' ){
            System.out.print("Enter the numbers : ");
            int num1 = cal.nextInt();
            int num2 = cal.nextInt();

            if (op == '+'){
                ans = num1 + num2;
            }else if (op == '-'){
                ans = num1 - num2;
            }else if (op == '*'){
                ans = num1 * num2;
            }else if (op == '/'){
                ans = num1 / num2;
            }else if (op == '%'){
                ans = num1 % num2;
            }else if (op == 'x'|| op == 'X') {
                System.out.println("Invalid");
            } else {
                System.out.print("Invalid Operator");
            }
        }
        System.out.println(ans);
    }
}
