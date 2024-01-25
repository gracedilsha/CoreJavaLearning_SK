package src.Basics_Jan13.Jan13_Polymorphism;

public class Person1 {

    void speak(String a)
    {
        System.out.println("A is a String:  "+ a);
    }

    void speak(int x)
    {
        System.out.println("X is an Integer:  " + x);
    }

    int speak(float y)
    {
        System.out.println("Y i s a float:  " + y);
        return 2;
    }
}
