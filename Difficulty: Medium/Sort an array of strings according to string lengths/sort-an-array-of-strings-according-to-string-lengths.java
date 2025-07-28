class Solution {
    public void sortByLength(String[] arr) {
        // code here
        List<String> list = Arrays.asList(arr);
        Collections.sort(list, Comparator.comparingInt(String::length));
        // System.out.println (list);
    }
}
