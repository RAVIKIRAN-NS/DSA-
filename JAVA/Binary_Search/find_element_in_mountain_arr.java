package ravi.Binary_search;

public class find_element_in_mountain_arr {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,3,1};
        int target = 3;
        System.out.println(find_ele(array,target));
    }
    static int find_ele(int[] arr,int target){
        int peak = peak(arr);
        int first_try = order_agnostic_BS(arr,target,0,peak);
        if (first_try!= -1){
            return first_try;
        }
        return order_agnostic_BS(arr,target,peak+1,arr.length-1);
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
//        System.out.println(arr[end]);
        return start;
    }

    static int order_agnostic_BS(int[] arr,int target,int start,int end){
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
