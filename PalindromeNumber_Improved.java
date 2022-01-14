public class PalindromeNumber_Improved {
    public static void main(String[] args) {
        int test = 1001;
        palindromeNumber(test);
    }

    public static boolean palindromeNumber(int x){
        if(x<0)return false;
        int reversed=0;
        int original=x;
        int reminder;
        while(x!=0){
            reminder = x%10;
            reversed = reversed*10+reminder;
            x/=10;
        }
        return original==reversed;
    }
}
