class Solution {
    public int compress(char[] chars) {
        String s="";
        int count=1;
         for(int i=0; i<chars.length; i++){
            if(i<chars.length-1 && chars[i]==chars[i+1]){
                count++;
                }else{
            if(count>1){
                s=s+chars[i]+count;
            
            }else{
                s=s+chars[i];
            }
            count=1;
        }
         }
         for(int k=0; k<s.length(); k++){
            chars[k]=s.charAt(k);
         }
         return s.length();
        
    }
}
