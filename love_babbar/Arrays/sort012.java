class Solution {
    public void sort012(int[] arr) {
        //brute force 
        // Arrays.sort(arr);
        
        //optimised 
        
        // int zero = 0;
        // int one = 0;
        // int two = 0;
        
        // for(int i = 0; i<arr.length; i++){
        //     if(arr[i] == 0){
        //         zero++;
        //     }
        //     else if(arr[i] == 1){
        //         one++;
        //     }
        //     else{
        //         two++;
        //     }
        // }
        
        // int i = 0;
        // while(zero != 0){
        //     arr[i++]=0;
        //     zero--;
        // }
        // while(one != 0){
        //     arr[i++]=1;
        //     one--;
        // }
        // while(two != 0){
        //     arr[i++]=2;
        //     two--;
        // }
        
        int zero = 0;
        int one = 0;
        int two = arr.length - 1;
        
        
        while(one <= two){
            if(arr[one] == 0){
                int temp = arr[zero];
                arr[zero] = arr[one];
                arr[one] = temp;
                
                zero++;
                one++;
            }
            
            else if(arr[one] == 1){
                one++;
            }
            else{
                int temp = arr[one];
                arr[one] = arr[two];
                arr[two] = temp;
                
                two--;
            }
            
        }
        
    }
}