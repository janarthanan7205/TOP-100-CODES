import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=scanner.nextInt();
        if (a>=0){
            if(a==0){
                System.out.print("The Number is Zero");
            }
            else{
                System.out.println("The number is Positive Number");
            }
        }
        else{
            System.out.println("The Number is Negative Number");
        }
    }
}
