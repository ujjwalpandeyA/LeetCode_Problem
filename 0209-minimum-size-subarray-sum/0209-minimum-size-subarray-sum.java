class Solution {
    public int minSubArrayLen(int target, int[] nums) {
         int slow=0;
        int sum=0;
        int count = nums.length+1;
         
         for(int i=0; i<nums.length; i++){
            sum+=nums[i];

            while(sum>=target){
                int currlen=i-slow+1;
                if(currlen<count){
                    count=currlen;
                }
                sum-=nums[slow];
                slow++;
            }   
        } 
        if(count==nums.length+1){
            return 0;
        }   
        return count;  
    }
}