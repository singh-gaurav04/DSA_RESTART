// if we have to maintain the order then we have to use extra space 

class Solution {
    public void segregateElements(int[] arr) {
        // Your code goes here
        List<Integer>pos = new ArrayList<>();
        List<Integer>neg = new ArrayList<>();
        
        for(int it : arr){
            if(it<0){
                neg.add(it);
            }
            else{
                pos.add(it);
            }
        }
        
        int i = 0;
        
        for(int it : pos){
            arr[i++]=it;
        }
        
        for(int it:neg){
            arr[i++] = it;
        }
        
        
    }
}