package ravi;

public class Shadowing {
    static int x = 90;
    public static void main(String[] args) {
        System.out.println(x);
        int x;
//        System.out.println(x);
        x = 4;
        System.out.println(x);
        num();
    }
    static void num(){
        System.out.println(x);
    }
}
