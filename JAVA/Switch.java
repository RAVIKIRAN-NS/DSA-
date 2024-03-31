package ravi;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner swi = new Scanner(System.in);
//        String fruits = swi.next();
        int num = swi.nextInt();

        switch (num) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }

//        switch (num){
//            case 1:
//
//            case 2:
//
//            case 3:
//
//            case 4:
//
//            case 5:
//                System.out.println("Weekday");
//                break;
//            case 6:
//
//            case 7:
//                System.out.println("Weekend");
//                break;
//
//        }

//        switch (num){
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//
//        }


//        switch (fruits) {
//            case "Mango" -> System.out.println("Eat mango");
//            case "Apple" -> System.out.println("Eat Apple");
//            case "Orange" -> System.out.println("Eat Orange");
//            case "Grapes" -> System.out.println("Eat Grapes");
//            default -> System.out.println("Invalid");
//        }

//        switch (fruits){
//
//            case "Mango":
//                System.out.println("Eat mango");
//                break;
//            case "Apple":
//                System.out.println("Eat Apple");
//                break;
//            case "Orange":
//                System.out.println("Eat Orange");
//                break;
//            case "Grapes":
//                System.out.println("Eat Grapes");
//                break;
//            default:
//                System.out.println("Invalid");
//        }

//        if (fruits.equals("mango")){
//            System.out.println("Eat mango");
//        }
//
//        if (fruits.equals("apple")){
//            System.out.println("Eat apple");
//        }
    }
}
