import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = scanner.nextInt(), i, sum = 0;
        for (i = 1; i <= a; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
