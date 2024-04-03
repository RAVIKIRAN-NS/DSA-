package ravi;

import java.util.Arrays;

public class change_values {
    public static void main(String[] args) {
        int[] arr = {1,2,34,5,6};
        changeArr(arr);
        System.out.println(Arrays.toString(arr)); // because array are mutable.
    }

    static void changeArr(int[] num) {
        num[0] = 99;
    }
}
