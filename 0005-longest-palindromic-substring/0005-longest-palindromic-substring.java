class Solution {
    public boolean ispalin(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!= str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        String longest="";
        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length(); j++) {
                String sub=s.substring(i,j+1);
                if(ispalin(sub)){
                    if(sub.length()>longest.length()){
                        longest=sub;
                    }
                }

            }
        }
        return longest;
        
    }
}