class Solution {
    public boolean detectCapitalUse(String word) {
       // Check if all letters are uppercase or lowercase
        boolean allCaps = word.equals(word.toUpperCase());
        boolean allLower = word.equals(word.toLowerCase());
        
        // Check if only the first letter is capitalized
        boolean firstCap = Character.isUpperCase(word.charAt(0)) && word.substring(1).equals(word.substring(1).toLowerCase());
        
        // Return true if any of the conditions are met
        return allCaps || allLower || firstCap;
    }
}