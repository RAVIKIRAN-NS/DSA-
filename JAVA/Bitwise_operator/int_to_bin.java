package ravi.bitwise_operator;

import java.util.Arrays;

public class int_to_bin {
    public static void main(String[] args) {
        int num = 23;
        int c = 0;
        while (2 <= num){
            num = num/2;
            c++;
        }
        System.out.println(c);
        int[] arr = new int[c];
        bin(23,arr);
        for (int i = 0; i < arr.length; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1];
            arr[arr.length-1] = temp;
        }
        System.out.println(Arrays.toString(arr));

    }

    static void bin(int num,int[] arr) {
        int n = 2;
        int c1 = 0;

        while (n <= num){

            arr[c1] = num % n;
            c1 = c1+1;
            num /= n;

        }
        System.out.println(Arrays.toString(arr));
    }
}
