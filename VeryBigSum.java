import java.util.List;

public class VeryBigSum {
    public static void main(String[] args) {
        
    }

    public static long veryBigSum(List<Long> arr){
        return arr.stream().reduce(0L, Long::sum);
    }
}
