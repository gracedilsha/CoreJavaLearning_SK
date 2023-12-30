package src.Basics_Dec30;

public class Dec30_StringRevers {
    public static void main(String[] args) {
        String name= "Shalini";
        char [] charArray= name.toCharArray();
        //System.out.println( charArray.length);
        int left =0;
        int right = charArray.length-1;

        while(left<right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            left++;
            right--;
        }
            String rev_name = new String(charArray);
            System.out.println(rev_name);
        }
    }

