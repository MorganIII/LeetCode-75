class Solution {
    public int longestPalindrome(String s) {
        /*
         This is the hashmap solution
        Map<Character,Integer> count = new HashMap<>();
        int longest = 0;
        int value = 0;
        boolean isOdd = false;
        for(Character c: s.toCharArray()){
            count.put(c,count.getOrDefault(c,0) + 1);
        }
        for(Character c: count.keySet()){
            value = count.get(c);
            if( value % 2 == 0 ){
                longest += value;
            } else{
                longest += value - 1;
                isOdd = true;
            }
        }
        if(isOdd) return longest + 1;
        return longest;
        */
        int[] count = new int[123];
        int longest = 0;
        boolean isOdd = false;
        for(char c: s.toCharArray()){
            count[c]++;
        }

        for(int i: count){
            if(i % 2 == 0){
                longest += i;
            } else {
                longest += i - 1;
                isOdd = true;
            }
        }
        if(isOdd) return longest + 1;
        return longest;

    }
}