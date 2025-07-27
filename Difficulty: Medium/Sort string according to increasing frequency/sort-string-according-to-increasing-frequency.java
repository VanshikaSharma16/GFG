class Solution {
    public String frequencySort(String s) {
        // code here
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        List<Character> charList = new ArrayList<>();
        for (char c : s.toCharArray()) {
            charList.add(c);
        }


        Collections.sort(charList, (a, b) -> {
            int freqCompare = freqMap.get(a) - freqMap.get(b);
            if (freqCompare == 0) {
                return Character.compare(a, b); // Lexicographical
            }
            return freqCompare;
        });

        // Step 4: Build the result string
        StringBuilder sb = new StringBuilder();
        for (char c : charList) {
            sb.append(c);
        }

        return sb.toString();
    }
};