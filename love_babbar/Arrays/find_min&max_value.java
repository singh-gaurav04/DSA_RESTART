class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        
        for(int it:arr){
            if(it < mini){
                mini = it;
            }
            
            if(it > maxi){
                maxi = it;
            }
        }
        
        // return new ArrayList<>(Arrays.asList(mini, maxi));
        return new ArrayList<>(List.of(mini,maxi)); //after 9+
        
    }
}
