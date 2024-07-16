package ravi.adv_maths;

public class sqrt_num {
    public static void main(String[] args) {
        int num = 36;
        System.out.println(sqrt_n(num));
    }
    static int sqrt_n(int n){
        int s = 0;
        int e = n;

        while (s <= e){
            int m = s + (e - s) / 2;

            if (m * m == n){
                return m;
            }
            if (m * m > n){
                e = m - 1;
            }else {
                s = m + 1;
            }
        }
        return -1;
    }
}
