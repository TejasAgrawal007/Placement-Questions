// Program to print the duplicate elements of an numsay.

class DuplicateNum_04 {
    static void findDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    System.out.print(nums[j] + " ");
                }
            }
        }
    }
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 4, 5 };
        int size = nums.length;
        findDuplicate(nums);
    }
}