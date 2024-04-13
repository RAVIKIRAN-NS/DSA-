package ravi.linear_search;

public class Find_min_value {
    public static void main(String[] args) {
        int[] arr = {11,22,33,-9,-44,77};
        System.out.println(minimum(arr));
    }
    static int minimum(int[] min_){
        int a = min_[0];
        for (int i = 1;i< min_.length;i++){
            if (min_[i] < a){
                a = min_[i];
            }
        }
        return a;
    }
}
