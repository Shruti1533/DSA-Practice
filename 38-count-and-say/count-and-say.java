class Solution {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        
        String previous = countAndSay(n - 1);
        StringBuilder ans = new StringBuilder();
        
        int count = 1;
        for (int i = 0; i < previous.length(); i++) {
            if (i < previous.length() - 1 && previous.charAt(i) == previous.charAt(i + 1)) {
                count++;
            } else {
                ans.append(count).append(previous.charAt(i));
                count = 1; // Reset count for the next character
            }
        }
        
        return ans.toString();
    }
}

