class Solution {
    public String removeStars(String s) {
        String ans="";
        Stack <Character> stack=new Stack<>();

        for(int i=0;i<s.length();i++){
            char b=s.charAt(i);
            if(b=='*'){
                if(!stack.isEmpty())
                {
                    stack.pop();
                }
            }
            else{
                stack.push(b);
            }
        }

        while(!stack.isEmpty()){
            ans=stack.peek()+ans;
            stack.pop();
        }
        return ans;
    }
}