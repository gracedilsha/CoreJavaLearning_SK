package src.Basics_Dec24;

public class Dec24_forLoop_halfTraingleReverse {
    public static void main(String[] args) {
        for( int i=0; i<=5; i++){
            for (int j=5; j>=i; j--) {
                System.out.print("*");
            }
            System.out.println("\t");
        }
    }
    }

