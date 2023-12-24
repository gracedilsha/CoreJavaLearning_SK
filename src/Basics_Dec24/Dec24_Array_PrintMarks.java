package src.Basics_Dec24;

import java.util.Scanner;

public class Dec24_Array_PrintMarks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        System.out.println("Enter the First Subject");
        marks[0] = sc.nextInt();
        System.out.println("Enter the Second Subject");
        marks[1] = sc.nextInt();
        System.out.println("Enter the Third Subject");
        marks[2] = sc.nextInt();
        System.out.println("Enter the Fourth Subject");
        marks[3] = sc.nextInt();
        System.out.println("Enter the Fifth Subject");
        marks[4] = sc.nextInt();
        System.out.println(" Your marks are:");

        for (int i = 0; i < marks.length; i++) {

            if (marks[i]<30){
            System.out.println(marks[i] + "You are failed in this subject");
                continue;
                    }
            System.out.println(marks[i]);
        }
}}