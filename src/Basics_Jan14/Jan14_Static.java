package src.Basics_Jan14;

public class Jan14_Static {

    public static String college_Name = "TTB";

    public int version = 3;

    // Static Method
    public static void printName(){
        System.out.println("College Name is "+ college_Name);
        //System.out.println(version);

    }


    //Non-Static Method
    public void printVersion(){
        System.out.println("version is :" + version);
        System.out.println("College Name is "+ college_Name);
    }
}
