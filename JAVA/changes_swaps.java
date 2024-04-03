package ravi;

public class changes_swaps {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

//        System.out.println(a+" "+b);
        swap(a,b);

        String name = "Ravi";
        //System.out.println(name);
        System.out.println(changename(name));

    }

    static String changename(String naam){
        System.out.println(naam);
        naam = "kiran";
        return naam;

    }
    static void swap(int a, int b) {
        System.out.println(a+" "+b);

        int temp = a;
        a = b;
        b = temp;
        System.out.println(a+" "+b);
    }

}
