package ravi.linear_search;

public class search_string_in_range {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6};
        int letter = 60;
        int str = linear_search(num,letter,2,5);
        System.out.println(str);

//        String name = "kiran";
//        char letter_ = 'a';
//        String str_ = lin_search(name,letter_,1,4);
//        System.out.println(str_);
   }
//    static String lin_search(String n,char target,int s,int e){
//        for (int index = s;index<= e;index++){
//            if (n.charAt(index) == target){
//                System.out.println("Index : "+index);
//                return "letter is:" + n.charAt(index);
//            }
//        }
//        return "false";
//    }
    static int linear_search(int[] n,int target, int start,int end){
        for (int index = start;index <= end;index++){
            if (n[index]== target){
                System.out.println("Index: "+ index);
                return n[index];
            }
        }
        return -1;
    }
}
