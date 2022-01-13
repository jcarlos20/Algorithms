import java.util.Arrays;
import java.util.stream.Stream;

public class ReverseString {
    public static void main(String[] args) {
        // String string = "hello";
        // String result = reverseString_String(string);
        // System.out.println(result);

        char[] s = {'h','e','l','l','o'};
        reverseString_Array(s);
        System.out.println("Done");
    }

    public static void reverseString_Array(char[]s){
        int left = 0;
        int right = s.length-1;
        while(left<=right){
            char temp = s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
    }

    public static String reverseString_String(String s){
        if((s.length() == 0 || s.length() ==1)){
            return s;
        }
        return reverseString_String(s.substring(1)) + s.charAt(0);
    }
}
