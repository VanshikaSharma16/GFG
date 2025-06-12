import java.util.*;

class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        // Convert int[] to Integer[] to use Collections.reverseOrder()
        Integer[] temp = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        Arrays.sort(temp, Collections.reverseOrder());
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            al.add(temp[i]);
        }
        return al;
    }
}
