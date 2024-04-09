package ravi;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner swi = new Scanner(System.in);
        int emp = swi.nextInt();
        String dep  = swi.next();

        // better way
        switch (emp) {
            case 1 -> System.out.println("Ravi");
            case 2 -> System.out.println("Kiran");
            case 3 -> {
                System.out.println("Enter department");
                switch (dep) {
                    case "IT" -> System.out.println("IT dep");
                    case "Management" -> System.out.println("Manage dep");
                    default -> System.out.println("No dep");
                }
            }
            default -> System.out.println("Enter Valid Emp.");
        }


        switch (emp){
            case 1 :
                System.out.println("Ravi");
                break;
            case 2:
                System.out.println("Kiran");
                break;
            case 3:
                System.out.println("Enter department");
                switch (dep){
                    case "IT":
                        System.out.println("IT dep");
                        break;
                    case "Management":
                        System.out.println("Manage dep");
                        break;
                    default:
                        System.out.println("No dep");
                }
                break;
            default:
                System.out.println("Enter Valid Emp.");
        }
    }
}
