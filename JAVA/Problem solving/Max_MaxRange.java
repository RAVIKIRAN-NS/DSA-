package ravi;

public class Max_MaxRange {
    public static void main(String[] args) {
        int[] arr = {9,10,101,33,22,90};
        System.out.println(max_(arr));
        System.out.println(max_range(arr,3, arr.length-1));
    }
    static int max_(int[] num){
        int max_val = num[0];
        for (int i = 1;i < num.length;i++){
            if (num[i] > max_val){
                max_val = num[i];
            }
        }
        return max_val;
    }

    static int max_range(int[] arr_range, int start , int end){
        int range_max = arr_range[start];
        for (int i = start;i <= end;i++){
            if (arr_range[i] > range_max){
                range_max = arr_range[i];
            }
        }
        return range_max;
    }
}
