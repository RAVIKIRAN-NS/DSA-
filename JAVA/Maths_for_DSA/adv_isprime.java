package ravi.adv_maths;

public class adv_isprime {
    public static void main(String[] args) {
        int num = 40;
        boolean[] prime = new boolean[num+1];
        seive(num,prime);
    }
    static void seive(int n,boolean[] prime){
        for (int i = 2;i * i <= n;i++){
            if (!prime[i]){
                for (int j = i * 2;j <= n;j += i){
                    prime[j] = true;
                }
            }
        }
        for (int i = 2;i < n;i++){
            if (!prime[i]){
                System.out.print(i+" ");
            }
        }
    }
}
