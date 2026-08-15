class Solution {
    public boolean checkIfPangram(String s) {
        boolean[] v= new boolean[26];

        for(int i=0; i<s.length(); i++){
             int c=s.charAt(i);

             if(c>='A'  &&  c<='Z'){
                int id=c-'A';
                v[id]=true;
             }
             else if(c>='a'  &&  c<='z'){
                int id2=c-'a';
                v[id2]=true;
             }
        }

        for(int i=0; i<26; i++){
            if(!v[i])
            return false;
        }
        return true;
        
    }
}