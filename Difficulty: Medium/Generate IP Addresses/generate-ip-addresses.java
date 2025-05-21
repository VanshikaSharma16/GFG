/*complete the Function*/

class Solution {
    boolean check(String s) {
        if (s.length() == 0 || s.length() > 3)
            return false;
        if (s.length() > 1 && s.charAt(0) == '0') // leading 0 is invalid
            return false;
        int num = Integer.parseInt(s);
        return num >= 0 && num <= 255;
    }
    String generate(String s, int n, int i, int j, int k) {
        if (k + 1 >= n) return "";
        
        String s1 = s.substring (0, i + 1);
        String s2 = s.substring (i + 1, j + 1);
        String s3 = s.substring (j + 1, k + 1);
        String s4 = s.substring (k + 1);
        if (check(s1) && check(s2) && check(s3) && check(s4)){
            return s1 + "." + s2 + "." + s3 + "." + s4;
        }
        return "";
    }
    public ArrayList<String> generateIp(String s) {
        // code here
        ArrayList<String> res = new ArrayList<>();
        int n = s.length();
        
        if (n < 4 || n > 12) return res;
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    String st = generate(s, n, i, j, k);
                    if (!st.equals("")) {
                        res.add(st);
                    }
                }
            }
        }
        return res;
    }
}