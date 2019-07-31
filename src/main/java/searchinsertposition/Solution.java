package searchinsertposition;

public class Solution {
    public static int searchInsert(int[] nums, int target) {
        for(int i = 0;i<nums.length;i++){

            if(nums[nums.length-1]<target){
                return nums.length;
            }

            if(nums[0]>target){
                return 0;
            }

            if(nums[i] == target){
                return i;
            }

            if(nums[i]<target && nums[i+1]>target){
                return i+1;
            }

        }
        return 1;
    }
}
