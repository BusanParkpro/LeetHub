class Solution {
    public int[] runningSum(int[] nums) {
        int[] sumNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <= i; j++) {
                sumNums[i] = sumNums[i] + nums[j];  
            }
        }
        return sumNums;
    }
}