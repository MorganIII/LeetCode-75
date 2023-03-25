class Solution {
    public String getHint(String secret, String guess) {
         int bullCount = 0;
        int cowCount = 0;
        int[] guessMap = new int[10];
        int[] secretMap = new int[10];
        for(int i = 0; i < secret.length(); i++) {
            if(secret.charAt(i) == guess.charAt(i)) {
            bullCount++;
            } else{
            guessMap[guess.charAt(i)-'0']++;
            secretMap[secret.charAt(i)-'0']++;
            }
            
        }
        for(char c: secret.toCharArray()){
            if(guessMap[c-'0'] > 0 && secretMap[c-'0'] > 0) {
                guessMap[c-'0']--;
                secretMap[c-'0']--;
                cowCount++;
            }
        }

        return bullCount+"A"+cowCount+"B";
    }
}