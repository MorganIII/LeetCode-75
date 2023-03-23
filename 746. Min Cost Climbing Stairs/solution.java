class Solution {
			public int minCostClimbingStairs(int[] cost) {
				int n = cost.length;
		    int[] output = new int[n+2];
				output[n] = 0;
				output[n+1] = 0;
				for(int i = n-1; i >= 0; i--) {
					output[i] = cost[i] + Math.min(output[i+1],output[i+2]);
				}
				return Math.min(output[0],output[1]);
}
}