package ravi.cyclic_sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAll_missing {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> miss = find_all_miss(nums);
        System.out.println(miss);
        System.out.println(Arrays.toString(nums));

    }
    static List<Integer> find_all_miss(int[] arr){
        int  i = 0;
        while(i < arr.length){
            int correct = arr[i] -1;
            if (arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else {
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int index = 0;index < arr.length;index++){
            if (arr[index] != index+1){
                ans.add(index+1);
            }
        }
        return ans;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
