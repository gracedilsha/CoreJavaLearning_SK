package src.Basics_Dec30;

import java.util.Scanner;

public class _UserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the String");
        String name = sc.next();

        //String name ="Shalini";
        String y="";
        for(int i = name.length()-1; i>=0; i--) {
            y = y + name.charAt(i);
                }
        System.out.println(y);
    }
}
