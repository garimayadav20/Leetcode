class Solution {
     public String longestPrefix(String s) {
        int n = s.length();
        int[] lps = new int[n];
        
        int len = 0; // Length of the previous longest prefix suffix
        int i = 1;
        
        // Build the LPS array
        while (i < n) {
            if (s.charAt(i) == s.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        
        // The last element of the LPS array gives the length of the longest happy prefix
        int longestHappyPrefixLength = lps[n - 1];
        return s.substring(0, longestHappyPrefixLength);
    }
}