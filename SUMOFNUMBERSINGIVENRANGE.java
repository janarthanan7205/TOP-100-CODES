import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Starting Number:");
        int a = scanner.nextInt(), i, sum = 0;
        System.out.println("Enter the Starting Number:");
        int b=scanner.nextInt();
        for (i = a; i <= b; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
