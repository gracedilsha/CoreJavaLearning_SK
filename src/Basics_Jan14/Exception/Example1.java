package src.Basics_Jan14.Exception;

public class Example1 {
    public static void main(String[] args) {


        try {
            String sh = args[0];
            int a = Integer.parseInt(sh);
            int b = 10 / a;
            System.out.println(a);
            System.out.println(b);
        } catch (Exception e){
            System.out.println("You have not passed any arguments");
        }

    }
}