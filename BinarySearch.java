public class BinarySearch {
    public static void main(String[] args) {
        int[] data = new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 7;
        System.out.println(Binary_Search(data, target));
    }   
    
    public static int Binary_Search(int[]data, int target){
        
        int left = 0;
        int right = data.length - 1;

        while (left <= right){
            int mid = left + (right-left)/2;
            if(target == data[mid]) return mid;
            if(target<data[mid]){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return -1;
    }
}
