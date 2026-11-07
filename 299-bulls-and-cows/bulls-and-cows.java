class Solution {
    public String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;
        int[] freq = new int[10];
        for (int i = 0; i < secret.length(); i++) {
            char s = secret.charAt(i);
            char g = guess.charAt(i);
            if (s == g) {
                bulls++;
            } else {
                freq[s - '0']++;
            }
        }
        for (int i = 0; i < secret.length(); i++) {
            char s = secret.charAt(i);
            char g = guess.charAt(i);
            if (s != g && freq[g - '0'] > 0) {
                cows++;
                freq[g - '0']--;
            }
        }
        return bulls + "A" + cows + "B";
    }
}