package ravi.linear_search;

import java.util.Arrays;

public class Search_in_2d_arr {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {9,8,7,6},
            {61,2,1,8},
            {2,9}
        };
        int goal = 61;
        int[] ans = search(arr,goal);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr_2, int target){
        for (int row = 0;row< arr_2.length;row++){
            for (int col = 0;col<arr_2[row].length;col++){
                if (arr_2[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
