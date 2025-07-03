class Solution {
    int maxLen(int arr[]) {
        Map<Integer, Integer> prefixSumIndex = new HashMap<>();
        
        int sum = 0;
        int maxLength = 0;

        prefixSumIndex.put(0, -1);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (prefixSumIndex.containsKey(sum)) {
                int length = i - prefixSumIndex.get(sum);
                maxLength = Math.max(maxLength, length);
            } else {
                prefixSumIndex.put(sum, i);
            }
        }

        return maxLength;
    }
}