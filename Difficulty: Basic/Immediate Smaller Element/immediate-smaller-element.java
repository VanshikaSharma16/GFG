// User function Template for Java

class Solution {
    public void immediateSmaller(int arr[]) {
        
        
        
        if(arr.length == 1) {
            arr[0] = -1;
            return;
        }
        
        for(int i=0;i<arr.length-1;i++) {
            
            if(arr[i] > arr[i+1] ) {
                arr[i] = arr[i+1];
            }
            else {
                arr[i] = -1;
            }
        }
        
        arr[arr.length-1] = -1;
        
    }
}