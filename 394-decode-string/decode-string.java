public class Solution {
    public String decodeString(String s) {
        if (s.isEmpty()) {
            return "";
        }

        StringBuilder ans=helper(s);
        return ans.toString();
    }

    public static StringBuilder helper(String s) {
        Stack<Character> stack = new Stack<>();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch != ']') {
                stack.push(ch);
            } 
            else 
            {
                // Pop characters until '['
                StringBuilder inside = new StringBuilder();
                while (stack.peek() != '[') {
                    inside.insert(0, stack.pop());
                }
                stack.pop(); // Remove the '['

                int k = 0;
                int base=1;
                while (!stack.isEmpty() && Character.isDigit(stack.peek())) {
                    k = (stack.pop() - '0') * base+k;
                    base*=10;
                }

                // Repeat the inside string k times and push back to stack
                for (int j = 0; j < k; j++) {
                    for (int l = 0; l < inside.length(); l++) {
                        stack.push(inside.charAt(l));
                    }
                }
            }
        }

        // Build the final result 
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop());
        }

        return result;
    }
}
