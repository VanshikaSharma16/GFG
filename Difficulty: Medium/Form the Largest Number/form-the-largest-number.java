// User function Template for Java

class Solution {
    String findLargest(int[] arr) {
        // code here
        if (arr.length == 0) {
            return "0";
        }
        
        String[] arr1 = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = String.valueOf(arr[i]);
        }
        
        Arrays.sort(arr1, (a, b) -> (b + a).compareTo (a + b));
        if (arr1[0].equals("0")) {
            return "0";
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr1.length; i++) {
            sb.append(arr1[i]);
        }
        return sb.toString();
    }
}