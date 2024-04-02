package ravi;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner arm = new Scanner(System.in);
        System.out.print("enter the number: ");
        int num = arm.nextInt();
        boolean isArm = armstrong(num);
        System.out.println(isArm);

        for (int i = 100;i < 1000;i++){
            if (armstrong(i)){
                System.out.print(i+" ");
            }
        }
    }

    static boolean armstrong(int n) {
        int cubes = 0;
        int armstrong = n;
        while ( n > 0){
            int rem = n % 10;
            cubes += rem*rem*rem;
//            System.out.println(cubes);
            n = n / 10;
        }

        return cubes == armstrong;
//        if (cubes == armstrong){
//            return true;
//        }else return false;

    }
}
