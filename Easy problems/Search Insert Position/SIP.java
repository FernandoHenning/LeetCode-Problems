public class SIP {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 6;
        int output = searchInsert(nums, target);
        System.out.println(output);
    }

    public static int searchInsert(int[] nums, int target) {

        int length = nums.length;
        return getPositionIndex(nums, 0, length-1, target);
    }
    public static int getPositionIndex(int[] nums,int left, int right, int target){
        int index = 0;
        int middle = left + (right - left) / 2;

        if(left < right){
            if(nums[middle] == target) return middle;
            if(nums[middle] <target){
                return getPositionIndex(nums, middle + 1, right, target);
            }else if(nums[middle]>target){
                return getPositionIndex(nums, left, middle, target);
            }
        }
        return nums[right] < target ? right + 1 : right;
    }
}
