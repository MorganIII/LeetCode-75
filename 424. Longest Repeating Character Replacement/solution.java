class Solution {
    public int characterReplacement(String s, int k) {
        if(s.length() == k) return k;
        int longest = 0;
        int first = 0;
        int last = 0;
        int maxCount = 0;
        int stringLength = 0;
        int[] count = new int[26];
        while(last < s.length()) {
           count[s.charAt(last)-'A']++;
           maxCount = Math.max(maxCount,count[s.charAt(last)-'A']);
           if((last-first-maxCount+1 ) > k) {
                count[s.charAt(first)-'A']--;
                first++;
           } 
           longest = Math.max(longest, last-first+1);
           last++;
        }
        return longest;
}
}