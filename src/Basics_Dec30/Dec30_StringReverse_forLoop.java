package src.Basics_Dec30;

public class Dec30_StringReverse_forLoop {
    public static void main(String[] args) {
        String name ="Shalini";
        String y="";
        for(int i = name.length()-1; i>=0; i--) {
            y = y + name.charAt(i);
                }
        System.out.println(y);
    }
}
