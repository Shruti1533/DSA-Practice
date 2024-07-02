class Solution {
    public String removeDuplicates(String s) {
        int n=s.length();
        Stack <Character> stack=new Stack<>();

        StringBuilder str=new StringBuilder();
        if(n==0){
            return "";
        }

        for(int i=0;i<n;i++){
            char b=s.charAt(i);

            if(!stack.isEmpty() && stack.peek()==b){
                stack.pop();
            }
            else{
                stack.push(b);
            }
        }

        while(!stack.isEmpty()){
              str.insert(0, stack.pop());
        }

    return str.toString();
    }
}