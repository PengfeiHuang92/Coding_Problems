import java.util.Arrays;

//Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//Return the running sum of nums.
/**
 * Input: nums = [1,2,3,4] Output: [1,3,6,10] Explanation: Running sum is
 * obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 */
public class RunningSumof1dArray {

    public static void main(String[] args) {
        int[] tmpTest = { 1, 1, 1, 2, 3, 4, 2, 3, 4 };
        Arrays.sort(tmpTest);
        for (int i = 0; i < tmpTest.length; i++) {
            System.out.print(Integer.toString(tmpTest[i]) + ' ');
        }
        System.out.println(' ');
        int[] tmpResult = new int[4];
        tmpResult = runningSum(tmpTest);
        for (int i = 0; i < tmpResult.length; i++) {
            System.out.println(tmpResult[i]);
        }
    }

    public static int[] runningSum(int[] nums) {
        int[] tmpArray = new int[nums.length];
        tmpArray[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            tmpArray[i] = tmpArray[i - 1] + nums[i];

        }
        return tmpArray;
    }
}
