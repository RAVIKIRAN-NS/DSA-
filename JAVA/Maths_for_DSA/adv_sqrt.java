package ravi.adv_maths;

public class adv_sqrt {
    public static void main(String[] args) {
        System.out.println(sqrt_num(40));
    }
    static double sqrt_num(int n){
        double x = n;
        double root;
        while (true){
            root = 0.5 *(x + (n/x));
//            System.out.println(root);
            if (Math.abs(root - x) < 0.5){
                break;
            }
            x = root;
//            System.out.println(x);
        }
        return root;
    }
}
