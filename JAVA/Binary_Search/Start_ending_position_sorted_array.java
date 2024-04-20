package ravi.Binary_search;

import java.util.Arrays;

public class Start_ending_position_sorted_array {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 7;
        int[] ans = searchRange(nums,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] searchRange(int[] nums, int target) {
        int[] arr = {-1,-1};
        arr[0]= search(nums,target,true);
        arr[1]= search(nums,target,false);

        return arr;
    }

    static int search(int[] nums,int target ,boolean firstStartindex){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end-start)/ 2;
            if(target < nums[mid]){
                end = mid -1;
            }else if(target > nums[mid]){
                start = mid + 1;
            }else{
                ans = mid;
                if(firstStartindex){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}

