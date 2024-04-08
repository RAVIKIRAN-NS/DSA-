package ravi;

import java.util.Scanner;

public class Function_or_method_examples {
    public static void main(String[] args) {

//        String message = greet();
//        System.out.println(message);
        Scanner message = new Scanner(System.in);
        System.out.print("Enter name: ");
        String naam = message.next();
        System.out.println(myGreet(naam));
    }

    static String myGreet(String name){
        String mssg = "Hello " + name;
        return mssg;

    }
    static String greet(){
        String mssg = "Hi How are you?";
        return mssg;
    }
}
