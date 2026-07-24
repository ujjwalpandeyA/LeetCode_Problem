class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int cap=nums1.length+nums2.length;
        int[] arr=new int[cap];

        int i=0,j=0,k=0;
        while(i<nums1.length && j<nums2.length ){
            if(nums1[i]<nums2[j]){
                arr[k]=nums1[i];
                i++;
            }else{
            arr[k]=nums2[j];
            j++;
            }
            k++;
        }
        while(i<nums1.length){
            arr[k]=nums1[i];
            i++;
            k++;
        }
        while(j<nums2.length){
            arr[k]=nums2[j];
            j++;
            k++;
        }
        int n=arr.length;
        double median;
        if(n%2!=0){
             median=arr[n/2];
        }else {
            double sum =arr[n/2]+arr[(n/2)-1];
            median =sum/2;            
        }
        return median;
        
    }
}