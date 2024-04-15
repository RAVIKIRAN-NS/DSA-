package ravi.Binary_search;

public class count_rotations {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(rotation_count(nums));
    }

    private static int rotation_count(int[] nums) {
        int pivot = find_pivot(nums);
        return pivot + 1;
    }
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
