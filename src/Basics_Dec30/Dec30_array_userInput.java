package src.Basics_Dec30;

import java.util.Scanner;

public class Dec30_array_userInput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Size:");
        int n= sc.nextInt();
        int [] int_array = new int [n];

        System.out.println("Enter the Elements:");
        for(int i=0; i<n; i++){
            int_array[i]=sc.nextInt();
        }
        System.out.println("_____Output_____");
        for(int i=0; i<n; i++){
            System.out.println(int_array[i]);
        }
        sc.close();
    }
}
