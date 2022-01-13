public class ReverseWords {
    public static void main(String[] args) {
        String string = "Hello friends";
        String result = reverseWords(string);
        System.out.println(result);
    }

    public static String reverseWords(String s){
        
        String[] words = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for(String word : words){
            stringBuilder.append(reverse(word)+" ");
        }
        return stringBuilder.toString();
    }

    public static String reverse(String s){
        if((s.length()==0)||(s.length()==1)){
            return s;
        }
        return reverse(s.substring(1))+s.charAt(0);
    }
}
