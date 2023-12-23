package src.Basics_Dec23;

import java.util.Scanner;

public class EX_Factorial
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int  number = sc.nextInt();

        long fact =1;

        int i=1;
        while(i<=number){
            fact=fact*i;
            i++;
                    }
        System.out.println("Fact: " + fact);
        sc.close();
    }


}
