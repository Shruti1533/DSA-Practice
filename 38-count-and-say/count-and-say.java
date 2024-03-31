class Solution {
    public String countAndSay(int n) {
        String ans="";
        if(n==1){
            return "1";
        }
        
        String s=countAndSay(n-1);

        for(int i=0;i<s.length();i++){
            char b=s.charAt(i); 
            int c=1; // Initialize the counter to 1 for the current character
            while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)){
                c++;
                i++;
            }
            ans+=Integer.toString(c)+ String.valueOf(b);

        }
        return ans;
    }
}
