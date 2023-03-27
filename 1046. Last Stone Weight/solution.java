class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length == 1) return stones[0];
        else if(stones.length == 2) return Math.abs(stones[0]-stones[1]);
        PriorityQueue<Integer> pQueue
            = new PriorityQueue<Integer>(Collections.reverseOrder());
        
        for(Integer i: stones) {
            pQueue.add(i);
        }
        int firstHeaviest = 0;
        int secondHeaviest = 0;
        int smashingResult = 0;
        while(pQueue.size() > 1) {
            firstHeaviest = pQueue.poll();
            secondHeaviest = pQueue.poll();
            smashingResult = Math.abs(secondHeaviest-firstHeaviest);
            if(smashingResult != 0) pQueue.add(smashingResult);
        }

        if(pQueue.peek() != null) {
            return pQueue.peek();
        }
        return 0;
    }
}