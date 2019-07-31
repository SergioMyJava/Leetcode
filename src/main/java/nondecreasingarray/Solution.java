package nondecreasingarray;

public class Solution {

    public static boolean checkPossibility(int[] nums) {
        int y = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {

                if (i == 0 && nums.length >= 3 && nums[i+1] > nums[i + 2]) {
                    return false;
                }
                if (i >= 1 && i < nums.length - 2 && nums[i - 1] > nums[i + 1] && nums[i] > nums[i + 2]) {
                    return false;
                }
                y++;
            }

        }
        return y == 1 || y == 0;
    }
}
