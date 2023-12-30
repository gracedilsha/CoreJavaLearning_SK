package src.Basics_Dec30;

public class Dec30_funct {
    public static void main(String[] args) {

        int c=sha_sum(5,2);
        System.out.println(c);

        int c1= sha_sum(5);
        System.out.println(c1);

        int c2 = sha_sum();
        System.out.println(c2);

        sayHello();

        }

        // function with return type
        static int sha_sum( int a, int b){
        return a+b;
        }

        // func with 1 parameter
        static int sha_sum(int input_1){
        return input_1;
        }

        static int sha_sum(){
        return 100;
        }

        static void sayHello(){
            System.out.println("Hello");

        }
    }

