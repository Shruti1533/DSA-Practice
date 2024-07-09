class Solution {
    public String removeStars(String s) {
        StringBuilder ans=new StringBuilder();
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
            ans=ans.insert(0,stack.peek());
            stack.pop();
        }
        return ans.toString();
    }
}