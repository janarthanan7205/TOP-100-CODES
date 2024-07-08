import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A:");
        int a = scanner.nextInt();
        System.out.println("Enter B:");
        int b=scanner.nextInt();
        if(a>b){
            System.out.println("A is greater");
        }
        else{
            System.out.println("B is greater");
        }
    }
}
