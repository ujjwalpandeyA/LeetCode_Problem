class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;

        int[] f=new int[26]; 

        for(int i=0; i<s.length(); i++){
            
            int index1= s.charAt(i)-'a';
            f[index1]++;

            int index2=t.charAt(i)-'a';
            f[index2]--;
        }
        for(int i=0; i<26; i++){
            if(f[i]!=0) return false;
        }
        return true;
        
    }
}