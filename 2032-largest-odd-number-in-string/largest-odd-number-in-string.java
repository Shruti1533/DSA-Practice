class Solution {
    public String largestOddNumber(String num) {

        int len=num.length()-1;
        for(int i=len;i>=0;i--){
            char b=num.charAt(i);
            int val=b-'0';
            if(val%2==1){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}