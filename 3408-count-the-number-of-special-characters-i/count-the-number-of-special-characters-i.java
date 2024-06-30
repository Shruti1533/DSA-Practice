class Solution {
    public int numberOfSpecialChars(String word) {
        int count = 0;

        boolean[] lowercasePresent = new boolean[26]; 
        boolean[] uppercasePresent = new boolean[26]; 


        for (int i = 0; i < word.length(); i++) 
        {
            char c = word.charAt(i);

            if (Character.isLowerCase(c)) {
                lowercasePresent[c - 'a'] = true; 
            } 
            
            else if (Character.isUpperCase(c)) {
                uppercasePresent[c - 'A'] = true; 
            }
        }

        
        for (int i = 0; i < 26; i++) {
            if (lowercasePresent[i] && uppercasePresent[i]) {
                count++;
            }
        }

        return count;
    }
}
