public class PalindromeNumber {
    public static void main(String[] args) {
        int test = 100001;
        System.out.println(isPalindromeNumber(test));
    }

    public static boolean isPalindromeNumber(int x){
        String number = String.valueOf(x);
        int start = 0;
        int end = number.length()-1;
        while(start<end){
            if(number.charAt(start++)!=number.charAt(end--)) return false;
        }
        return true;
    }
}
