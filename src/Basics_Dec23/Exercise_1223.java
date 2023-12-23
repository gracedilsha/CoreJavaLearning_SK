package src.Basics_Dec23;

import java.util.Scanner;

public class Exercise_1223 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the value for X..");
        double x = sc.nextDouble();
        System.out.println(" Enter the value for Y..");
        double y = sc.nextDouble();
        System.out.println(" Enter the value for z..");
        double z = sc.nextDouble();

        double result  = 0;

        result = Math.cbrt(Math.pow(x,2)+Math.pow(y,2)+Math.abs(z));
        System.out.println("Results is..." + result);

        sc.close();

    }
}
