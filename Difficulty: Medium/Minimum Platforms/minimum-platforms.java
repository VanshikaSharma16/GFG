// User function Template for Java

class Solution {
    // Function to find the minimum number of platforms required at the
    // railway station such that no train waits.
    static int findPlatform(int arr[], int dep[]) {
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i = 0, j = 0;
        int platformNeeded = 0, maxPlatform = 0;
        while (i < arr.length && j < arr.length) {
            if (arr[i] <= dep[j]) {
                platformNeeded++;
                i++;
            } else {
                platformNeeded--;
                j++;
            }
            maxPlatform = Math.max (maxPlatform, platformNeeded);
        }
        return maxPlatform;
    }
}
