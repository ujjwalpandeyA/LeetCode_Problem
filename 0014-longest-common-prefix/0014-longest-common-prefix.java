class Solution {
    public String longestCommonPrefix(String[] s) {
        Arrays.sort(s);

        String f=s[0];
        String l=s[s.length-1];

        int i=0;
        while(i<f.length()  && i<l.length()){
            if(f.charAt(i)==l.charAt(i)){
                i++;
            }else{
                break;
            }
        }
        return f.substring(0,i);
        
    }
}