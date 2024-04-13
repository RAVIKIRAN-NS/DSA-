package ravi.linear_search;

public class linear_search {
    public static void main(String[] args) {
        int[] arr = {11,22,33,99,44,77};
        int searched = search(arr,99);
        System.out.println(searched);

    }
    static int search(int[] search, int target){
        for (int index = 0;index < search.length;index++){
            int element = search[index];
            if (element == target){
                System.out.println("Index : " + index);
                return element;
            }
        }
        System.out.println("Not found");
        return -1;
    }
}
