package src.Basics_Jan14.Exception;

public class Example {
    public static void main(String[] args) {
        extracted2();
    }

    private static void extracted2() {
        extracted1();
        System.out.println("extracted1 Execute");
    }

    private static void extracted1() {
        extracted();
        System.out.println("extracted1 Execute");
    }

    private static void extracted() {

        try {
            String name = null;
            name.length();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


