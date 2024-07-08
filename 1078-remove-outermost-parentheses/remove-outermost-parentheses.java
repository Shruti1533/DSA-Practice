class Solution {
    public String removeOuterParentheses(String s) {
        Stack <Character> stack=new Stack<>();
        StringBuilder str=new StringBuilder();

        for(int i=0;i<s.length();i++){
            char b=s.charAt(i);

            if(b=='('){
                if(!stack.isEmpty()){
                    str.append(b);
                }
                stack.push(b);
            }
            else{
                stack.pop();
                if(!stack.isEmpty()){
                    str.append(b);
                }
            }
        }
        return str.toString();
    }
}