package ravi.adv_maths;

public class hcf_gcd {
    public static void main(String[] args) {
        System.out.println(gcd_hcf(4,18));
    }
    static int gcd_hcf(int a,int b){
        if (a == 0){
            return b;
        }
        return gcd_hcf(b%a,a);
    }
}
