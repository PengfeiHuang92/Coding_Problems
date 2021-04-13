// Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.

// The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.

// You may assume the integer does not contain any leading zero, except the number 0 itself.

// Example 1:

// Input: digits = [1,2,3]
// Output: [1,2,4]
// Explanation: The array represents the integer 123.
// Example 2:

// Input: digits = [4,3,2,1]
// Output: [4,3,2,2]
// Explanation: The array represents the integer 4321.
// Example 3:

// Input: digits = [0]
// Output: [1]

public class PlusOne {
    public static void main(String[] args) {
        int[] i = plusOne(new int[] { 9, 9, 9, 9 });
        for (int j : i) {
            System.out.println(j);
        }

    }

    public static int[] plusOne(int[] digits) {
        if (digits.length == 0)
            return digits;
        int length = digits.length;
        boolean stop = false;
        while (!stop && length > 0) {
            if (digits[length - 1] == 9) {
                digits[length - 1] = 0;
                length--;
            } else {
                digits[length - 1] = digits[length - 1] + 1;
                stop = true;
            }
        }
        if (!stop) {
            int[] nums = new int[digits.length + 1];
            nums[0] = 1;
            return nums;
        }

        return digits;
    }
}
