class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> output = new ArrayList<>();
        Map<String,Integer> count = new HashMap<>();
        for(String w: words) {
            count.put(w,count.getOrDefault(w,0)+1);
        }
        PriorityQueue<String> pq = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String word1, String word2) {
                int freq1 = count.get(word1);
                int freq2 = count.get(word2);
                if(freq1 == freq2) {
                    return word2.compareTo(word1);
                } else {
                    return freq1 - freq2;
                }
            }
        });
        for(Map.Entry<String,Integer> entry: count.entrySet()) {
            pq.add(entry.getKey());
            if(pq.size() > k) pq.poll();
        }
        while(!pq.isEmpty()) output.add(pq.poll());
        Collections.reverse(output);
        return output;
    }
}