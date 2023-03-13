class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        int leftSum = 0;
        int rightSum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        
        //check all the left elements first
        if((sum - nums[0]) == 0) return 0;

        for(int i = 1; i < nums.length - 1; i++){
           leftSum += nums[i-1];
           rightSum = sum - leftSum - nums[i];
           if (leftSum == rightSum) return i;
        }
          
        //check the most right element last
        if((sum - nums[nums.length - 1]) == 0) return nums.length - 1;

    return -1;
    }
}