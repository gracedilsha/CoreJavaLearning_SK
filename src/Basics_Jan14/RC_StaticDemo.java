package src.Basics_Jan14;

public class RC_StaticDemo {
    public static void main(String[] args) {
        //System.out.println(StaticDemo_0210.college_name);
        //StaticDemo_0210.printCollegeDetails();

        StaticDemo_0210 s = new StaticDemo_0210();
        s.printVersion();

        StaticDemo_0210 s1 = new StaticDemo_0210();
        s1.version = 100;
        s1.printVersion();

        StaticDemo_0210.college_name = "TTA";

        StaticDemo_0210 s2 = new StaticDemo_0210();
        s2.version = 102;
        s2.printVersion();

    }
}
