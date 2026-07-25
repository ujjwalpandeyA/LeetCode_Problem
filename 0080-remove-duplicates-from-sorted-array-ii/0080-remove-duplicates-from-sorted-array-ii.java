class Solution {
    public int removeDuplicates(int[] a) {
        int slow=2;
        for(int i=2; i<a.length; i++){
            if(a[i]!=a[slow-2]){
            
                a[slow]=a[i];
                slow++;
            }
        }
        return slow;
        
    }
}
