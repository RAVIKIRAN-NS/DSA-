package ravi;

public class scoping {
    public static void main(String[] args) {
        int a = 9;
        String b = "rk";

        ranom(b);

        {
            a = 999; // can modify outside variable
//            int b = 100; error cant initialize again
            int c = 100;
            System.out.println(a);
            System.out.println(c);
        }

        a =10000;
        System.out.println(a);

        for (int i = 0; i <= 2;i++){
            System.out.println(i);
            int num = 77;
            b = "vv";
        }
       // System.out.println(num); cant use num bcuz its inside for loop
        System.out.println(b);// can use bcuz its initialized outside for but modified inside for.

        ranom(b);
    }


    static void ranom(String marks){
        int sum = 1001;
        System.out.print(sum);
        System.out.println(marks);
    }
}
