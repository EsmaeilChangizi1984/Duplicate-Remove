public class DuplicateElement {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 2, 3, 4, 4 };
        System.out.println(removeDuplicates(arr));

    }

    public static int removeDuplicates(int[] nums) {

        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}
