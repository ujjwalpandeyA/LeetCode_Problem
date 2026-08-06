class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int cd=0;

        for(int i : nums){
            if(count ==0){
                cd=i;
            }
            if(i==cd){
                count++;
            }else{
                count--;
            }
        }
        return cd;
        
    }
}