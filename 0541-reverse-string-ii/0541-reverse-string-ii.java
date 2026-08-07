class Solution {
    public String reverseStr(String s, int k) {
        char[] a = s.toCharArray();
        int n=a.length;

        for(int l=0; l<n; l+=2*k){
        int i=l;
        int j=l+k-1;
        if(j>=n){
            j=n-1;
        }
        while(i<j){
            char temp= a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        }
        return new String(a);
        
    }
}