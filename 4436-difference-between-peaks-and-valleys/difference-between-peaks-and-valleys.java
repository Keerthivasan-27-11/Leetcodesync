class Solution {
    public int peakValleyDifference(int[] nums) {
        int r1 = 0,r2 = 0;
        for(int i = 1;i<nums.length-1;i++){
            if(nums[i] > nums[i - 1] && nums[i] > nums[i + 1]){
                r1 += nums[i];
            }
            if(nums[i] < nums[i - 1] && nums[i] < nums[i + 1]){
                r2 += nums[i];
            }
        }
        return r1-r2;
    }
}