class Solution {
    public boolean backspaceCompare(String s, String t) {
        return deleteBackSpace(s).equals(deleteBackSpace(t));
    }
    public String deleteBackSpace(String s) {
        String outputS = "";
        int count = 0;
        for(int last = s.length()-1; last >= 0; last--) {
            if(s.charAt(last) != '#' && count == 0) {
                outputS = s.charAt(last) + outputS;
            } else if (s.charAt(last) == '#') {
                count++;
            } else {
                count--;
            }
        }
        return outputS;
    }
}
