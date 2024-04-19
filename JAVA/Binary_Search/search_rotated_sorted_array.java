package ravi.Binary_search;

public class search_rotated_sorted_array {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
//        int[] nums = {5,1,3};
        //int[]nums={1,5};
//        int[] nums = {2,9,2,2,2};
        int target = 2;
        System.out.println(search_rotate(nums,target));
    }
    static int search_rotate(int[] nums,int target){
//        int pivot = findpivot_in_duplicates(nums);
        int pivot = find_pivot(nums);
        if (pivot == -1){
            return binary_search(nums,target,0,nums.length-1);
        }
        if (nums[pivot] == target){
            return pivot;
        }
        if (target >= nums[0]){
            return binary_search(nums,target,0,pivot-1);
        }
        return binary_search(nums,target,pivot+1,nums.length-1);
    }
    static int binary_search (int[] nums,int target,int start,int end){
        while (start <= end ){
            int mid = start + (end-start)/2;
            if (target < nums[mid]){
                end = mid -1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
    //without duplicates.
    static int find_pivot(int[] nums){
        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
            int mid = start + (end-start)/2;
            if (mid < end && nums[mid] > nums[mid+1]){
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid-1]){
                return mid - 1;
            }
            if (nums[mid] <= nums[start]){
                end = mid -1;
            }else {
                start = mid+1;//this two conditions is useful only when single element in arr or when arr is not roatated.
            }
        }
        return -1;
    }
    //with duplicates
    static int findpivot_in_duplicates(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if (mid < end && nums[mid] > nums[mid+1]){
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid-1]){
                return mid - 1;
            }
            //if elements at mid,start,end are same skip.
            if (nums[mid]== nums[start] && nums[mid] == nums[end]){
                if (nums[start] > nums[start+1]){
                    return start;
                }
                start++;
                if (nums[end] < nums[end-1]){
                    return end-1;
                }
                end--;
            } else if (nums[start]<nums[mid] || nums[start] == nums[mid] && nums[mid] < nums[end]) {
                start = mid +1;
            }else {
                end = mid -1;
            }
        }
        return -1;
    }
}
