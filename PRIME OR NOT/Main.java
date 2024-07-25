package com.jana;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=scanner.nextInt();
        hello hello = new hello();
        hello.helloWorld(n);
        scanner.close();

    }
}
