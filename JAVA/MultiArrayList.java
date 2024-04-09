package ravi;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrayList {
    public static void main(String[] args) {
        Scanner arr = new Scanner(System.in);
        ArrayList<ArrayList<Integer>>  lists = new ArrayList<>();

        for (int i = 0;i < 3; i++){
            lists.add(new ArrayList<>());
        }

        for (int j = 0; j< 3;j++){
            for (int i = 0;i<3;i++){
                lists.get(j).add(arr.nextInt());
            }
        }
        System.out.println(lists);
    }
}
