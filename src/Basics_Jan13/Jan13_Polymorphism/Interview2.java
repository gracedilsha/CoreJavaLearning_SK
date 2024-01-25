package src.Basics_Jan13.Jan13_Polymorphism;

public class Interview2 {
    public static void main(String[] args) {
        Person2 h1=new Person2();
        Person2 h2=new Person2();
        Person2 h3=null;

        h2.run();
    }
}

class Person2{
    int a;
    void run()
    {
        System.out.println("Run Called");
    }
}
