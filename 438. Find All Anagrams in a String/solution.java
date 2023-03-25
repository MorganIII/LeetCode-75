class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int first = 0;
        int last = -1;
        int[] pChar = new int[26];
        int[] sChar = new int[26];
        List<Integer> output = new ArrayList<>();
        for(char c: p.toCharArray()) {
            pChar[c-'a']++;
        }

        while(last < s.length()) {
            if(last - first == p.length()-1) {
                if(Arrays.equals(pChar,sChar)){
                    output.add(first);
                }
                sChar[s.charAt(first)-'a']--;
                first++;
                last++;
                if (last < s.length()) sChar[s.charAt(last)-'a']++;
            } 
            else {
                last++;
                if (last < s.length()) sChar[s.charAt(last)-'a']++;
            }

        }
        return output;

    }
   
}