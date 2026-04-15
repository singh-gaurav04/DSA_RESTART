class Solution {
    public int kthSmallest(int[] arr, int k) {
        
        //brute force
        // Arrays.sort(arr);
        // return arr[k - 1];
        
        //optimized 
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int num : arr) {
            maxHeap.add(num);
            if (maxHeap.size() > k) {
                maxHeap.remove();
                // maxHeap.poll();
            }
        }

        return maxHeap.peek();
    }
}