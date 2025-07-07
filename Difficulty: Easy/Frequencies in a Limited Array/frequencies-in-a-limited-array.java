class Solution {
    public List<Integer> frequencyCount(int[] arr) {
        HashMap<Integer , Integer> h = new HashMap<>();
        ArrayList<Integer> l = new ArrayList<>();
        for(int i :arr){
            h.put(i,h.getOrDefault(i,0)+1);
          
        }
        for(int i =1 ; i<=arr.length;i++){
            if(h.containsKey(i)) l.add(h.get(i));
            else l.add(0);
        }
        return l;
    }
}
