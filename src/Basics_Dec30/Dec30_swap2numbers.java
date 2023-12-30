package src.Basics_Dec30;

import java.util.Scanner;

public class Dec30_swap2numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A:");
        int a = sc.nextInt();
        System.out.println("Enter the value of B:");
        int b = sc.nextInt();

        int temp =a;
        a=b;
        b=temp;

        System.out.println("Value of A :" + a);
        System.out.println("Value of B:" + b);

    }
}
