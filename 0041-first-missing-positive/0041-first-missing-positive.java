class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set= new HashSet<> ();
        for(int num: nums){
            set.add(num);
        }
        int n= Integer.MAX_VALUE;
        for(int i=1; i<n; i++){
            if(!set.contains(i)){
                return i;
            }
        }
       return 1; 
    }
}