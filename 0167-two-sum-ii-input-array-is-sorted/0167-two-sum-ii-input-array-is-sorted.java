class Solution {
    public int[] twoSum(int[] a, int tg) {
        int sum=0;
        int i=0;
        int j=a.length-1;
        while(i<j){
            sum=a[i]+a[j];
            if(sum==tg) return new int[]{i+1,j+1};
            else if(sum>tg) j--;
            else i++;
        }
        return new int[]{-1,-1};
        
    }
}