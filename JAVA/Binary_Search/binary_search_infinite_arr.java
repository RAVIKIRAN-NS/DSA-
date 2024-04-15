package ravi.Binary_search;

public class binary_search_infinite_arr {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,15,44,88,90,101,921,988,999,1000};//note: index of array should be proper.
        int target = 1000;
        System.out.println(ans(arr,target));
    }
    static int ans(int[] nums,int target){
        int start = 0;
        int end = 1;

        while (target > nums[end]){
            int newstart = end + 1;
            end = end + (end-start+1)*2;
            start = newstart;
        }
        return binary_search(nums,target,start,end);
    }

    static int binary_search(int[] arr1,int target,int start,int end){
        while (start <= end){
            int mid = start + (end - start)/2;
            if (target < arr1[mid]){
                end = mid -1;
            } else if (target > arr1[mid]) {
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
