package ravi

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        Scanner al = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);

        list.add(12);
        list.add(33);
        list.add(99);
        list.add(71);

        System.out.println(list);
        list.set(0,100);
        System.out.println(list);

        for (int i = 0;i < 6;i++){
            list.add(i);
            System.out.println(list.get(i));
        }
        System.out.println(list);



    }
}
