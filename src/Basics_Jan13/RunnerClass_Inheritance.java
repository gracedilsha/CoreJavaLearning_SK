package src.Basics_Jan13;

public class RunnerClass_Inheritance {
    public static void main(String[] args) {
        Son s= new Son();
        Father f = new Son();
        Grandfather g = new Father();



        s.BHK3();
        s.BHK1();
        f.BHK3();
    }
}
