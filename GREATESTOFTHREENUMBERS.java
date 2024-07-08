import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A:");
        int a = scanner.nextInt();
        System.out.println("Enter B:");
        int b = scanner.nextInt();
        System.out.println("Enter C:");
        int c = scanner.nextInt();
        if (a > b) {
                if (a > c) {
                    System.out.println("A is greatest");
                } else {
                    System.out.println("c is greatest");
                }
            }
         else{
                System.out.println("C is greatest");
            }
        }
    }


