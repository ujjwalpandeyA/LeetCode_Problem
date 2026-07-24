class Solution {
    public int[] sortedSquares(int[] a) {

        int[] arr = new int[a.length];
        int i=0;
        int j=a.length-1;
        int k=arr.length-1;
        while(i<=j){
            int lsq= a[i]*a[i];
            int rsq=a[j]*a[j];
            if(lsq<rsq){
                arr[k]=rsq;
                j--;
            }else{
            arr[k]=lsq;
            i++;
        }
        k--;
        }
        return arr;
    }
}