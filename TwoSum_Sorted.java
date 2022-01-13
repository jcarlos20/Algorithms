import java.util.HashMap;
import java.util.Map;

public class TwoSum_Sorted {
    public static void main(String[] args) {
        // int[] nums = new int[]{2,7,11,15};
        // int[] result = twoSum(nums, 9);
        int[] nums = new int[]{1,3,4,5,7,11};
        int[] result = twoSum_Improved(nums, 9);
        System.out.println(result);
    }

    public static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i <= nums.length-1; i++){
            int key = target - nums[i];
            if(map.containsKey(key)){
                return new int[]{map.get(key), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

    public static int[] twoSum_Improved(int[]nums, int target){
        int L = 0;
        int R = nums.length-1;
        while(L < R){
            if((nums[L] + nums[R])==target){
                return new int[]{L+1, R+1};
            }else if((nums[L] + nums[R]) > target){
                R--;
            }else{
                L++;
            }
        }
        return null;
    }
}
