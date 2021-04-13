public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        int[] testInt = new int[] { 1, 1, 2, 2, 3, 4, 5, 5, };
        System.out.println(removeDuplicates(testInt));
        for (int i : testInt)
            System.out.println(i);
    }

    public static int removeDuplicates(int[] nums) {
        // first Pointer i
        int i = 0;
        // second Pointer j
        for (int j = 0; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                // first Pointer move forward by 1
                i++;
                // let first Pointer point at the second Pointer data
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
