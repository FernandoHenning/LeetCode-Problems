import java.util.Arrays;

public class PO {
    public static void main(String[] args) {
        int[] digits = {8,9,9,9};
        int[] newDigits = plusOne(digits);
        System.out.println(Arrays.toString(newDigits));
    }

    static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
