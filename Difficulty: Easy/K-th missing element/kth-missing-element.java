// User function Template for Java

// User function Template for Java

class Solution {

    int KthMissingElement(int arr[], int k) {
        
        int ans = -1;
        
        for(int i=1; i<arr.length; i++){
            int missing = arr[i] - arr[0] - i;
            if(missing >= k){
                ans = arr[i] - 1 - missing + k;
                break;
            }
        }
        
        return ans;
    }
}