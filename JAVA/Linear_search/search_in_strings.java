package ravi.linear_search;

public class search_in_strings {
    public static void main(String[] args) {
        String name = "kiran";
        char letter = 'i';
        System.out.println(search_ch(name,letter));
//        System.out.println(search_ch1(name,letter));
    }
    static boolean search_ch(String word,char ch){
        for (int i = 0;i < word.length();i++){
            if (word.charAt(i) == ch){
                return true;
            }
        }
        return false;
    }

//    static boolean search_ch1(String word,char ch){
//        for (char cc : word.toCharArray()){
//            if (cc == ch){
//                return true;
//            }
//        }
//        return false;
//    }
}
