class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        
        for(int i=0;i<words.length;i++){
            String w=words[i];
             if((w.length()>=pref.length()) && w.substring(0,pref.length()).equals(pref)){
                count++;
             }
        }
        return count;
    }
}