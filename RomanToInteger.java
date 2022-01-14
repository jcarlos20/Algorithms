import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "CXVII";
        System.out.println(romanInteger(s));
    }

    // public static int romanInteger(String s){
        
    //     HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    //     map.put('I', 1);
    //     map.put('V', 5);
    //     map.put('X', 10);
    //     map.put('L', 50);
    //     map.put('C', 100);
    //     map.put('D', 500);
    //     map.put('M', 1000);

    //     int resultado = 0;
    //     int R = 1;
    //     int L = 0;

    //     while(R<=s.length()){

    //         if(map.get(s.charAt(R))>map.get(s.charAt(L))){
    //             int temp = map.get(s.charAt(R)) - map.get(s.charAt(L));
    //             resultado = resultado + temp;
    //             R += 2;
    //             L += 2;
    //         }else{
    //             resultado = resultado + map.get(s.charAt(L));
    //             R++;
    //             L++;
    //         }
    //     }
    //     return resultado;
    // }

    // public static int romanInteger(String s){
    //     HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    //     map.put('I', 1);
    //     map.put('V', 5);
    //     map.put('X', 10);
    //     map.put('L', 50);
    //     map.put('C', 100);
    //     map.put('D', 500);
    //     map.put('M', 1000);

    //     int resultado = 0;
    //     int i = 0;

    //     while(i<=s.length()-1){
    //         if(map.get(s.charAt(i+1)) > map.get(s.charAt(i))){
    //             int temp = map.get(s.charAt(i+1)) - map.get(s.charAt(i));
    //             resultado = resultado + temp;
    //             i+=2;
    //         }else{
    //             resultado = resultado + map.get(s.charAt(i));
    //             i++;
    //         }
    //     }
    //     return resultado;
    // }

    public static int romanInteger(String s){
        
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        
        String lastSymbol = s.substring(s.length()-1);
        int lastValue = map.get(lastSymbol);
        int total = lastValue;

        for(int i = s.length()-2; i>=0; i--){
            String currentSymbol = s.substring(i, i+1);
            int currentValue = map.get(currentSymbol);
            if(currentValue<lastValue){
                total-=currentValue;
            }else{
                total+=currentValue;
            }
            lastValue=currentValue;
        }
        return total;
    }
}
