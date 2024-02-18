package src.Basics_Jan14.Exception;

public class Example2 {

    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 10 / a;
            System.out.println(a);
            System.out.println(b);
        } catch (Exception e)
        {
            System.out.println("Exit");
            System.out.println("Error message is" + e.getMessage());
            //System.exit(0  );
        }
        finally {
            System.out.println("I am final");
        }



    }
}
