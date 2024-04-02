package ravi;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner prime = new Scanner(System.in);
        System.out.print("enter the number: ");
        int num = prime.nextInt();
        boolean isPrime = checkPrime(num);
        System.out.println(isPrime);
    }

    static boolean checkPrime(int n) {
        if (n <= 1){
            return  false;
        }
        int c = 2;
        while (c * c <=n ){
            if (n % c == 0){
                return false;
            }
            c++;
        }
        return c * c > n;
    }
}
