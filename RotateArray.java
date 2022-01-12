public class RotateArray {
    public static void main(String[] args) {
            int[] nums = new int[]{1,2,3,4,5,6,7};
            int[] result = rotateArray(nums, 3);
            System.out.println(result);
    }

    public static int[] rotateArray(int[]nums, int k){
        
        int[]a = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int j = (i+k)%nums.length;
            a[j] = nums[i];
        }
        for(int i = 0; i < nums.length; i++){
            nums[i]=a[i];
        }
        return nums;
    }
}
