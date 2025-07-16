class Solution {
    public String toggleCase(String s) {
        // code here
        StringBuilder res = new StringBuilder();
        for (char c: s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                res.append (Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                res.append (Character.toUpperCase(c));
            } else {
                res.append (c);
            }
        }
        return res.toString();
    }
}
