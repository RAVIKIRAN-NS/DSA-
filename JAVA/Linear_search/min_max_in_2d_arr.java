package ravi.linear_search;

public class min_max_in_2d_arr {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {9,8,7,6},
                {61,2,1,8},
                {2,9}
        };
        int ans = max(arr);
        System.out.println(ans);
    }
    static int max(int[][] arr_){
        int max = Integer.MIN_VALUE;
        for (int row = 0;row<arr_.length;row++){
            for(int col = 0;col<arr_[row].length;col++){
                if (arr_[row][col] > max){
                    max = arr_[row][col];
                }
            }
        }
        return max;
    }
}
