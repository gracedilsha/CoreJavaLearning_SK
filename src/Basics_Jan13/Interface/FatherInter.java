package src.Basics_Jan13.Interface;

interface FatherInter {

 void loan1K();

 default void print()
 {
     System.out.println("I am default method");
 }

 static void print2()
 {
     System.out.println("I am Static Method");
 }
}
