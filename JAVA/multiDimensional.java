package ravi;

import java.util.Arrays;
import java.util.Scanner;

public class multiDimensional {
    public static void main(String[] args) {
        Scanner arr = new Scanner(System.in);
        int arr2[][] = new int[3][3];
        System.out.println(arr2.length);

        for (int row = 0; row < arr2.length; row++) {
            for (int col = 0; col < arr2[row].length; col++) {
                arr2[row][col] = arr.nextInt();
            }
        }
//        for (int row = 0; row < arr2.length; row++) {
//            for (int col = 0; col < arr2[row].length; col++) {
//                System.out.print(arr2[row][col] + " ");
//            }
//            System.out.println();
//        }
        for (int row = 0; row < arr2.length; row++) {
            System.out.println(Arrays.toString(arr2[row]));
        }
        System.out.println(arr2[2][1]);
    }
}
