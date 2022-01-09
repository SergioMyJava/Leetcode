package twosum;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0;i<nums.length;i++) {
            for (int j = 1; j < nums.length; j++) {
                if(i != j) {
                    int m = nums[i] + nums[j];
                    if (m == target) {
                        int[] catchNums = {i, j};
                        return catchNums;
                    }
                }
            }
        }
        System.out.println("In array no matches");
        int[] matches = {};
        return matches;
    }
}
