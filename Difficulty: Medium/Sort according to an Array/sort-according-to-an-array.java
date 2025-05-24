// User function Template for Java

class Solution {
    // A1[] : the input array-1
    // N : size of the array A1[]
    // A2[] : the input array-2
    // M : size of the array A2[]

    // Function to sort an array according to the other array.
    public static int[] sortA1ByA2(int A1[], int N, int A2[], int M) {
        // TreeMap keeps elements in sorted order
        
        TreeMap<Integer, Integer> map = new TreeMap<>();
        List<Integer> ans = new ArrayList<>();
        
        for(int num : A1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        for(int num : A2) {
            if(map.containsKey(num)) {
                int val = map.get(num);
                
                while(val > 0) {
                    ans.add(num);
                    val--;
                }
                
                map.remove(num);
            }
        }
        
        for(int num : map.keySet()) {
            int val = map.get(num);
                
            while(val > 0) {
                ans.add(num);
                val--;
            }
        }
        
        return ans.stream().mapToInt(i -> i).toArray();
    }
 
}
