class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans="";
        if(strs.length==0){
            return "";
        }

        String base=strs[0];
        for(int i=0;i<base.length();i++){
            for(int j=1;j<strs.length;j++){
                if (i >= strs[j].length() || base.charAt(i) != strs[j].charAt(i)) {
                    return base.substring(0, i);
                }
            }
        }
        return base;
    }
}