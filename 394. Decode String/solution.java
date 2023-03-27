class Solution {
    public String decodeString(String s) {
        Stack<String> output = new Stack<>();
        Stack<Integer> counts = new Stack<>();
        int index = 0;
        String result = "";
        String number = "";
        while(index < s.length()) {
            if(Character.isDigit(s.charAt(index))) {
                while(Character.isDigit(s.charAt(index))) {
                number += s.charAt(index);
                index++;
                }
                counts.push(Integer.parseInt(number));
                number = "";
            } else if(s.charAt(index) == '[') {
                output.push(result);
                result = "";
                index++;
            } else if(s.charAt(index) == ']') {
                StringBuilder temp = new StringBuilder(output.pop());
                int count = counts.pop();
                for(int i = 0; i < count; i++) {
                    temp.append(result);
                }
                result = temp.toString();
                index++;
            } else {
                result += s.charAt(index);
                index++;
            }
        }
        return result;
    }
}