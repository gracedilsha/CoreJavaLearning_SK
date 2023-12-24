package src.Basics_Dec24;

import java.util.Scanner;

public class Dec24_Arrays_PrintMarks_1 {
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        float[] marks = new float[5];
        System.out.println("Enter the First Subject");
        marks[0] = sc.nextFloat();
        System.out.println("Enter the Second Subject");
        marks[1] = sc.nextFloat();
        System.out.println("Enter the Third Subject");
        marks[2] = sc.nextFloat();
        System.out.println("Enter the Fourth Subject");
        marks[3] = sc.nextFloat();
        System.out.println("Enter the Fifth Subject");
        marks[4] = sc.nextFloat();

        for (int i = 0; i < marks.length; i++) {
            if(marks[i] < 30){
                System.out.println("You are fail in this subject" + marks[i]);
            }
            System.out.println(marks[i]);
        }

        sc.close();






    }
}
