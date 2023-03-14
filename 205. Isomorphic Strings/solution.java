class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        Map<Character,Character> mapChar = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            if(mapChar.containsKey(s.charAt(i)) && mapChar.get(s.charAt(i)) == t.charAt(i) ) {
              continue;
            } else if(!mapChar.containsKey(s.charAt(i)) && !mapChar.containsValue(t.charAt(i))) {
                mapChar.put( s.charAt(i) , t.charAt(i) );
            } else {
                return false;
            }
        }      
    return true;
    
    }
}