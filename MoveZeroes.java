public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0,3,12};
        int[] result = moveZeroes(nums);
        System.out.println(result);
    }

    public static int[] moveZeroes(int[]nums){
        int R = 0;
        int L = 0;
        while(R < nums.length){
            if(nums[R]==0){
                R++;
            }else{
                int temp = nums[L];
                nums[L] = nums[R];
                nums[R] = temp;
                R++;
                L++;
            }
        }
        return nums;
    }
}
