package ravi.Binary_search;

public class order_agnostic_binary_search {
    public static void main(String[] args) {
//        int[] nums= {1,2,3,4,5,6,7,8,9};
        int[] nums = {9,8,7,6,5,4,3,2,1};
        int goal = 8;
        int ans = order_agnostic_BS(nums,goal);
        System.out.println(ans);
    }
    static int order_agnostic_BS(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end){
            int mid = start + (end-start)/2;

            if (arr[mid] == target){
                return mid;
            }

            if (isAsc){
                if (target < arr[mid]){
                    end = mid -1;
                }else {
                    start = mid + 1;
                }
            }else {
                if (target > arr[mid]){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return  - 1;
    }
}
