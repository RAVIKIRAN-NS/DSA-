package ravi.Binary_search;

public class search_element_Using_binary_search {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
//        int[] arr = {4,5,6,7,0,1,2};
        int goal = 7;
        int ans = binary_search(arr,goal);
        System.out.println(ans);
    }

    static int binary_search(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
