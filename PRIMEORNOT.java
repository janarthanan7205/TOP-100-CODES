import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = obj.nextInt();
        checkPrime(num);
    }

    private static void checkPrime(int num) {
        int count = 0;
        if (num < 2) {
            System.out.println("The Given Number " + num + " is not Prime");
            System.exit(0);
        }
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count = count + 1;
            }
        }
        if (count > 2) {
            System.out.println("The given number " + num + " is not a prime number");
        } else {
            System.out.println("The given number " + num + " is a prime number");
        }
    }
}
