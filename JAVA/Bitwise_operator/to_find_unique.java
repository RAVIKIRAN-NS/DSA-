package ravi.bitwise_operator;

public class to_find_unique {
    public static void main(String[] args) {
        int[] arr = {2,3,3,4,2,6,4,6,7,1,7};
        System.out.println(ans(arr));
    }
    static int ans(int arr[]){
        int unique = 0;

        for (int n : arr ){
            unique ^= n;
        }
        return unique;

    }
}
