package ravi.cyclic_sort; // you can change the package Name

import java.util.Arrays;

public class Missing_Number {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,0};
        int ans = missing_num(arr);
        System.out.println(ans);
        System.out.println(Arrays.toString(arr));
    }
    static int missing_num(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else {
                i++;
            }
        }
        for (int index = 0;index < arr.length;index++){
            if (arr[index] != index){
                return index;
            }
        }
        return arr.length;
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
