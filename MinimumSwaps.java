import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MinimumSwaps {
    public static void main(String[] args) {
        // int[] nums = new int[]{0,1,0,1,1,1,0,1,1};
        // int result = minSwaps(nums);
        // System.out.println(result);

        List<Integer> arrayIntegers = new ArrayList<>(Arrays.asList(1,1,1,0,0,0,0));
        int output = minSwaps_Improved(arrayIntegers);
        System.out.println(output);
    }

    public static int minSwaps(int[] nums){
        int index = 0;
        int result = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                index++;
            }
        }
        for(int i=0;i<index;i++){
            if(nums[i]==1){
                result++;
            }
        }
        return result;
    }

    public static int minSwaps_Improved(List<Integer> nums){

        List<Integer> original = nums;
        List<Integer> sortedAsc = nums.stream().sorted().collect(Collectors.toList());
        List<Integer> sortedDes = nums.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        int countAsc = 0;
        int countDes = 0;
        for(int i=0; i<original.size();i++){
            if(original.get(i)!=sortedAsc.get(i)){
                countAsc++;
            }
        }
        for(int i=0; i<original.size();i++){
            if(original.get(i)!=sortedDes.get(i)){
                countDes++;
            }
        }

        return Math.min(countAsc, countDes);
    }
}
