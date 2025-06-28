// User function Template for Java

class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int n=arr.length;
        int m=arr[0].length;
        int ans=-1;
        boolean found=false;
        for(int j=0;j<m;j++){
            for(int i=0;i<n;i++){
                if(arr[i][j]==1){
                    found=true;
                    ans=i;
                    break;
                }
            }
            if(found==true) break;
        }
        return ans;
        
    }
}