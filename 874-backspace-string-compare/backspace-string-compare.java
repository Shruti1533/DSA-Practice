class Solution {
    public boolean backspaceCompare(String s, String t) {
        return buildString(s).equals(buildString(t));
    }
    
    private String buildString(String str) {
        Stack<Character> stack = new Stack<>();
        
        for (int i=0;i<str.length();i++) {
            char c=str.charAt(i);
            if (c != '#') {
                stack.push(c);
            } else if (!stack.isEmpty()) {
                stack.pop();
            }
        }
        
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
        char c = stack.pop();
        result.insert(0, c); // Insert at the beginning to maintain the original order
    }
        
        return result.toString();
    }
}