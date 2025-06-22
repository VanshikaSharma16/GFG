class Solution {
    public boolean canSplit(int arr[]) {
        // code here
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        int prefixSum = 0;
        int diff = 0;
        for (int j = 0; j < arr.length - 1; j++) {
            prefixSum += arr[j];
            diff = totalSum - prefixSum;
            if (diff == prefixSum) {
                return true;
            }
            diff = 0;
        }
        return false;
    }
}