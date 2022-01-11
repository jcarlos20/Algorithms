public class SortedSquares {
    public static void main(String[] args) {
        int[] nums = new int[]{-3, -2, -1, 4, 5, 6};
        int[] result = Sorted_Squares(nums);
        System.out.println(result);
    }

    public static int[] Sorted_Squares(int[] nums){
        int [] result = new int[nums.length];
        int start = 0;
        int end = nums.length - 1;

        for (int i = end; i >= 0; i--){
            if(Math.abs(nums[start]) >= Math.abs(nums[end])){
                result[i]=nums[start]*nums[start];
                start++;
            }else{
                result[i]=nums[end]*nums[end];
                end--;
            }
        }
        return result;
    }
}
