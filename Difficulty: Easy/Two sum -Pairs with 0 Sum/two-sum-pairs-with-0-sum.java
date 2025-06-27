// User function Template for Java

class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int zeroes=0;
        for (int i : arr) {
            if(i==0) zeroes++;
            set.add(i);
        }
        
        Integer[] sortedArr = set.toArray(new Integer[0]);
        Arrays.sort(sortedArr);
        
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < sortedArr.length; i++) {
            if (set.contains(-sortedArr[i])) {
                ArrayList<Integer> pair = new ArrayList<>();
                if(sortedArr[i]==0){
                    if(zeroes>1){
                        pair.add(sortedArr[i]);
                        pair.add(sortedArr[i]);
                        ans.add(pair);
                    }
                }
                else{
                pair.add(Math.min(sortedArr[i],-sortedArr[i]));
                pair.add(Math.max(sortedArr[i],-sortedArr[i]));
                ans.add(pair);
                set.remove(-sortedArr[i]);
                set.remove(sortedArr[i]);
                }
                
            }
        }
        
        return ans;
    }
}