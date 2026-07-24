class Solution {
    public int removeDuplicates(int[] a) {

        int slow=0;
        for (int i=1; i<a.length; i++){
            if(a[i]!=a[slow]){
                slow++;
                a[slow]=a[i];
            }
        }
        return slow+1;    
    }
}