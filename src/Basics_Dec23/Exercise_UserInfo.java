package src.Basics_Dec23;

import java.util.Scanner;

public class Exercise_UserInfo {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter you Name:");
        String name = sc.next();
        System.out.println(" Enter you Age:");
        int age = sc.nextInt();
        System.out.println(" Enter you Salary:");
        double salary = sc.nextDouble();

        System.out.println(" Your Details are:" + name +"    "+ age+"     "+salary);

        sc.close();
    }
}
