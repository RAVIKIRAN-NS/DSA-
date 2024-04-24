package ravi.Selection_sort;

import java.util.Arrays;

public class Selection_sort {
    public static void main(String[] args) {
        int[] arr ={3,4,1,5,2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for (int i = 0;i < arr.length;i++){
            int last = arr.length - i -1;
            int maxIndex = maxi(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]= temp;
    }
    static int maxi(int[] arr,int start,int end){
        int max = start;
        for (int i = start;i<= end;i++){
            if (arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }
}
