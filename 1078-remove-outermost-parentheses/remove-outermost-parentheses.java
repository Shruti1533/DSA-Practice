class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans=new StringBuilder();
        Stack <Character> st=new Stack<>();

        int start=0;

        for(int i=0;i<s.length();i++){
            char b=s.charAt(i);
            if(b=='('){
                st.push(b);
            }
            else if(b==')'){
                st.pop();
                if(st.isEmpty()){
                    ans.append(s.substring(start+1,i));
                    start=i+1;
                }
            }
        }
        return ans.toString();
    }
}