package src.Basics_Dec30;

import java.util.Scanner;

public class Dec30_swap2numbers2_trycatch {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value of A:");
            int a = sc.nextInt();
            System.out.println("Enter the value of B:");
            int b = sc.nextInt();

            a = a * b;
            b = a / b;
            a = a / b;

            System.out.println("Value of A :" + a);
            System.out.println("Value of B:" + b);
        }catch (Exception e){
            System.out.println("Please enter no other than ZERO");
        }

    }
}
