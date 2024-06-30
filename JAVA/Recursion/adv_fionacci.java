package Recursion;


public class adv_fionacci {
    public static void main(String[] args) {
        System.out.println(fibo_formula(50));
    }
    static int fibo_formula(int num){
        return (int)(Math.pow((1+Math.sqrt(5)/2), num)/Math.sqrt(5));
    }

}
