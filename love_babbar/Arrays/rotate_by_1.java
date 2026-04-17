// // User function Template for Java

class Solution {
    public void rotate(int[] arr) {
        // brute force
        
        List<Integer>list = new ArrayList<>();
        
        list.add(arr[arr.length -1]);
        for(int i = 0; i<arr.length-1; i++){
            list.add(arr[i]);
        }
        
        
        for(int i = 0; i<list.size(); i++){
            arr[i] = list.get(i);
        }
        
    }
}