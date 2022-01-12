public class RotateArray_Improved {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        int[] result = rotateArray(nums, 3);
        System.out.println(result);
    }

    public static int[] rotateArray(int[] nums, int k){
        k=k%nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        return reverse(nums, k, nums.length-1);
    }

    public static int[] reverse(int[]nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
        return nums;
    }
}
