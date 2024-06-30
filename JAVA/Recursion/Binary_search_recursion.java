package Recursion;

public class Binary_search_recursion {
    public static void main(String[] args) {
        int[] arr = {23,8,11,33,92,101};
        int target = 92;
        System.out.println(search(arr,target,0,arr.length-1));
    }
    static int search(int[] arr, int target, int s,int e){
        if (s > e){
            return -1;
        }
        int m = s + (e - s) / 2;

        if (arr[m] == target){
            return m;
        }
        if (target < arr[m]){
            return search(arr,target,s,m-1);
        }

        return search(arr,target,m+1,e);
    }
}
