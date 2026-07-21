class Solution {
    public void rotate(int[] nums, int k) {
        int i= nums.length;
        k= k%i;
        reverse(nums,0,i-1);
        reverse(nums,0,k-1);
        reverse(nums,k,i-1);
        
    }
    public static void reverse(int a[],int l,int r){
        while(l<r){
            int temp = a[l];
            a[l]= a[r];
            a[r]=temp;
            l++;
            r--;
        }
    }
}