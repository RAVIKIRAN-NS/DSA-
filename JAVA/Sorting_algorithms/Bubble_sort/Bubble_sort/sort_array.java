package ravi.bubble_sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class sort_array {
    public static void main(String[] args) {
        int[] arr ={3,4,1,5,2};
        sort(arr);
//        System.out.println(arr[0]);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        boolean swapped;
        for (int i = 0;i < arr.length;i++){
            swapped = false;
            for (int j=1;j < arr.length -i;j++){
                if (arr[j] < arr[j-1]){
                    int new_num = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = new_num;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }
}
