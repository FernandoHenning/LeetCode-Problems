import java.util.Arrays;

public class RE {
    public static void main(String[] args) {
        int[] nums = {2};
        int val = 3;
        int k = removeElement(nums, val);
        System.out.println("K: " + k);
        System.out.println("Nums :" + Arrays.toString(nums));
    }
    public static int removeElement(int[] nums, int val) {
        int length = nums.length;
        int k = 0;
        if(length == 0) return 0;
        if (length == 1) {
            return nums[0] != val ? ++k : k;
        }
        for (int i = 0; i < length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
