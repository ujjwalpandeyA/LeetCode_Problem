class Solution {
    public int removeDuplicates(int[] nums) {

        int slow=0;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]!=nums[i+1]){
                slow++;
                nums[slow]=nums[i+1];
            }
        }
        return slow+1;        
    }
}