class Solution {
    public String makeGood(String s) {
        Stack <Character> stack=new Stack<>();
        int n=s.length();
        String great=""; 

        for(int i=0;i<n;i++){
            char b=s.charAt(i);
            if (!stack.isEmpty() && Math.abs(stack.peek() - b) == 32) {
                stack.pop();
            } 
            
            else {
                stack.push(b);
            }
        }

        while(!stack.isEmpty()){
            great=stack.peek()+great;
            stack.pop();
        }

        return great;
    }
}