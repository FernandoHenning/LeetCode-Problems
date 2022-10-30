import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RDSA {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int k = removeDuplicates(nums);
        System.out.println("Array ordenado = " + Arrays.toString(nums) + " K = " + k);
    }

    public static int removeDuplicates(int[] nums){
        int length = nums.length;
        if (length == 0 || length == 1) {
            return length;
        }

        int k = 0;
        for (int i = 0; i < length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[k++] = nums[i];
            }
        }

        nums[k++] = nums[length - 1];

        return k;
    }
}
