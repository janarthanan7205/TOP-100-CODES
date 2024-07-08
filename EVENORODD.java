import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=scanner.nextInt();
        if (a%2==0){
                System.out.println("The number is Even Number");
            }
        else{
            System.out.println("The Number is Odd Number");
        }
    }
}
