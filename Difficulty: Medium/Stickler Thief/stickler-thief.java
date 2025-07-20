class Solution {
    public int findMaxSum(int arr[]) {
        // code here
       int n = arr.length;
       int prevPrev = 0, prev = 0;
       for (int i = 0; i < n; i++) {
           int curr = Math.max (prev, prevPrev + arr[i]);
           prevPrev = prev;
           prev = curr;
       }
       return prev;
    }
}
// int oddSum = 0;
// int evenSum = 0;
// for (int i = 0; i < arr.length; i++) {
//     if (i % 2 == 0) {
//         oddSum += arr[i];
//     } else {
//         evenSum += arr[i];
//     }
// }
// if (oddSum > evenSum) {
//     return oddSum;
// } else {
//     return evenSum;
// }