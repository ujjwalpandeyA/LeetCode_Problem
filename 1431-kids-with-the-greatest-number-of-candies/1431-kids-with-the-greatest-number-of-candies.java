class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

       List<Boolean> res= new ArrayList<> ();
        int maxi=findMax(candies);
        for(int i=0; i<candies.length; i++){
            res.add(candies[i]+extraCandies>=maxi);
        }
        return res;
        
    }
      private int findMax(int[] candies){
            int max=Integer.MIN_VALUE;
            for(int i=0; i<candies.length; i++){
                if(candies[i]>max){
                    max=candies[i];
                }
            }
            return max;
        }
}