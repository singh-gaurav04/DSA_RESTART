class Solution {
    public int getMinDiff(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;
        int ans = arr[n-1] - arr[0];
        
        for(int i = 1; i<arr.length; i++){
            if(arr[i]-k < 0){
                continue;
            }
            
            int mini = Math.min(arr[0]+k,arr[i]-k);
            int maxi = Math.max(arr[i-1] + k, arr[n-1] - k);
            
            ans = Math.min(ans,maxi-mini);
        }
        
        return ans;
    }
}
