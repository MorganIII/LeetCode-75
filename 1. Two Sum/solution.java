class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int value = 0;
        int[]indexes = new int[2];
        for(int i = 0; i < nums.length; i++) {
            value = target - nums[i];
            if(map.containsKey(value)) {
                indexes[0] = map.get(value);
                indexes[1] = i;
                break;
            }
            else {
                map.put(nums[i],i);
            }
        }
        return indexes;
}
}