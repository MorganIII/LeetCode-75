class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() >= 1 && t.length() >= 1) {
        int right = 0;
        for(char c: t.toCharArray()){
            if(right >= s.length()) break;
            if(s.charAt(right) == c){
                right++;
            } 
        }
        if(right >= s.length()){
          return true;
        }
        return false;
        }
        if (s.length()==0 ) return true;
        return false;
    }
}