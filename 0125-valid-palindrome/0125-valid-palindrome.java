class Solution {
    public boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
         while(i<j){
            while(i<j && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
             while(i<j && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            char lChar=Character.toLowerCase(s.charAt(i));
            char rChar=Character.toLowerCase(s.charAt(j));

            if(lChar != rChar) return false;

            i++;
            j--;  
         }
         return true;
        
    }
}