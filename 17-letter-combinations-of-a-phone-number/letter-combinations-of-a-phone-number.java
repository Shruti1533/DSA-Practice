import java.util.*;

class Solution {
    private static final String[] mappings = {"", "", "abc", "def", "ghi", "jkl", "mno",          "pqrs", "tuv", "wxyz"};

    private List<String> ans = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) {
            return ans;
        }
        helper(digits, new StringBuilder(), 0);
        return ans;
    }

    private void helper(String digits, StringBuilder result, int index) {
        if (index == digits.length()) {
            ans.add(result.toString());
            return;
        }

        int d = digits.charAt(index) - '0';
        String letters = mappings[d];
        char[] lettersArray = letters.toCharArray(); 
        for (int i = 0; i < lettersArray.length; i++) { 
            char letter = lettersArray[i]; 

            result.append(letter); 
            helper(digits, result, index + 1);
            result.deleteCharAt(result.length() - 1);
        }
    }
}
