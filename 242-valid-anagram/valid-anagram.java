class Solution {
    public boolean isAnagram(String s, String t) {
        // Convert strings to character arrays
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        
        // Sort the character arrays
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        
        // Compare sorted arrays
        return Arrays.equals(sChars, tChars);
    }
}
