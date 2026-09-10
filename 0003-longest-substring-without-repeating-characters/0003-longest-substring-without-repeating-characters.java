import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> win = new HashSet<>();
        
        int maxLen = 0;
        int left = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char currChar = s.charAt(right);
            
            while (win.contains(currChar)) {
                win.remove(s.charAt(left));
                left++;
            }
            
            win.add(currChar);
            maxLen = Math.max(maxLen, right - left + 1);
        }
        
        return maxLen;
    }
}