class Solution {
    public String[] findWords(String[] words) {
        String[] ans = new String[words.length];
        String r1 = "qwertyuiop";
        String r2 = "asdfghjkl";
        String r3 = "zxcvbnm";
        int k = 0;

        for (int i = 0; i < words.length; i++) {
            String s = words[i].toLowerCase();
            boolean a = true; // Reset a for each word

            for (int j = 0; j < s.length(); j++) {
                char b = s.charAt(j);

                if (!r1.contains(String.valueOf(b))) {
                    a = false;
                    break;
                }
            }

            if (a) {
                ans[k++] = words[i];
                continue; // Skip the rest of the loop if a is true
            }

            a = true; // Reset a for each word
            for (int j = 0; j < s.length(); j++) {
                char b = s.charAt(j);

                if (!r2.contains(String.valueOf(b))) {
                    a = false;
                    break;
                }
            }

            if (a) {
                ans[k++] = words[i];
                continue; // Skip the rest of the loop if a is true
            }

            a = true; // Reset a for each word
            for (int j = 0; j < s.length(); j++) {
                char b = s.charAt(j);

                if (!r3.contains(String.valueOf(b))) {
                    a = false;
                    break;
                }
            }

            if (a) {
                ans[k++] = words[i];
            }
        }

        return Arrays.copyOf(ans, k);
    }
}
