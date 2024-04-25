package ravi.cyclic_sort;

import java.util.Arrays;

public class sort_cyclic {
    public static void main(String[] args) {
        int[] arr = {3,5,1,2,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        int i = 0;
        while (i < arr.length){
//            int correct_0 = arr[i];  // use this when arr has 0.
            int correct = arr[i]-1;
//            if (arr[i] < arr.length && arr[i] != arr[correct])  - used to find missing values.
            if (arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
