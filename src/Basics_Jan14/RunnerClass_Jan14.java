package src.Basics_Jan14;

public class RunnerClass_Jan14 {
    public static void main(String[] args) {
       // System.out.println(Jan14_Static.college_Name);
       // Jan14_Static.printName();

        Jan14_Static s1 = new Jan14_Static();
        s1.version = 20;
                s1.printVersion();

                Jan14_Static.college_Name = "TTA";

        Jan14_Static s2 = new Jan14_Static();
        s2.version = 85;
        s2.printVersion();


    }
}
