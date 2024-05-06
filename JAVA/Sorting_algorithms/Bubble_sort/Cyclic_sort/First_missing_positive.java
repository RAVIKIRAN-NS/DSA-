package ravi.cyclic_sort;

import java.util.Arrays;

public class First_missing_positive {
    public static void main(String[] args) {
//        int[] nums = {3,4,1,-1};
//        int[] nums = {1,2,3,4};
        int[] nums = {1,0,2};
        System.out.println(positive_miss(nums));
        System.out.println(Arrays.toString(nums));
    }
    static int positive_miss(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correct = arr[i] -1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else {
                i++;
            }
        }
        for (int index = 0;index <arr.length;index++){
            if (arr[index] != index+1){
                return index+1;
            }
        }
        return arr.length +1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
