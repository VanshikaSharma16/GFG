// User function Template for Java

class Solution {
    ArrayList<Integer> arranged(ArrayList<Integer> arr) {
        
        int n=arr.size();
        ArrayList<Integer> res = new ArrayList<>(Collections.nCopies(n, 0));

        int pos=0;
        int neg=1;
        for(int i=0;i<n;i++){
            if(arr.get(i)<0){
                res.set(neg,arr.get(i));
                neg+=2;
            }
            else{
                res.set(pos,arr.get(i));
                pos+=2;
            }
        }
        return res;
    }
}
