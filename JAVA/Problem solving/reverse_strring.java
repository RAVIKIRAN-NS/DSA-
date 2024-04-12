package ravi;

public class reverse_strring {
    public static void main(String[] args) {
        String name = "ravikiran";
        String rev_name = "";
        for (int i = name.length()-1;i > -1;i--){
            rev_name = rev_name + name.charAt(i);
        }
        System.out.println(rev_name);
    }
}
