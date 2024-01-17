package src.Basics_Jan14;

public class StaticDemo {
    public static void main(String[] args) {
        Demo1 d = new Demo1();
        Demo1 d1 = new Demo1();
        Demo1 d2 = new Demo1();

        Demo1.method2();
        d.method1();



    }
}
        class Demo1 {
            static {
                System.out.println("SIB");
            }

            {
                System.out.println("IIB");
            }

            int a = 10;
            static int b = 20;

            void method1() {
                System.out.println("Print A:" + a);
                System.out.println("Print B:" + b);
            }

            static void method2() {
                // System.out.println("Print A:"+ a);
                System.out.println("Print B:" + b);
            }
        }

