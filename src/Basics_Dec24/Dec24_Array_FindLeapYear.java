package src.Basics_Dec24;

import java.util.Scanner;

public class Dec24_Array_FindLeapYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year");
        int year = sc.nextInt();

        if ((year%4==0 && year%100!=0) || (year%400==0)){
            System.out.println("This is a Leap Year");
                    }
        else{
            System.out.println("This is not a leap year");
        }

        }
    }

