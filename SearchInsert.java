public class SearchInsert {
    public static void main(String[] args) {
        int[] data = new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 6;
        System.out.println(Search_Insert(data, target));
    }

    public static int Search_Insert(int[]nums, int target){
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            int pivot = left + (right-left)/2;
            if(target == nums[pivot]) return pivot;
            if(target<nums[pivot]) right = pivot - 1;
            else left = pivot + 1;
        }
        return left;
    }
}
