import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A:");
        int a = scanner.nextInt();
        if (a % 4 == 0) {
            System.out.println("It is Leap year!");
        } else {
            System.out.println("It is Not A Leap year");
        }
    }
}




