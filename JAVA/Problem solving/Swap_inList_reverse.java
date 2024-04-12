package ravi;

import java.util.Arrays;

public class Swap_inList_reverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
//        System.out.println(Arrays.toString(arr));
//        swap(arr,1,3);
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr_){
        int start = 0;
        int end = arr_.length-1;
        while (start < end){
            swap(arr_,start,end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr, int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
