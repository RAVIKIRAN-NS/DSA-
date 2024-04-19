package ravi.Binary_search;

// leetcode - peak index in mountain array : easy.

public class Peak_index_in_Mountain_arr {
    public static void main(String[] args) {
        int[] arr = {0, 10, 5, 2};
        System.out.println(peak(arr));
    }
    static int peak(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }else {
                start = mid + 1;
            }
        }
        System.out.println(arr[end]);//end == start.
        return start;
    }
}

//same for 162 nd problem in leetcode : medium
