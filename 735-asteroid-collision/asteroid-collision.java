class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack <Integer> stack=new Stack<>();
        boolean same = false;
        for(int i=0;i<asteroids.length;i++){
            same=false;

            //Checking collision condition i.e., -ve coming and +ve is there already
            while(!stack.isEmpty() && asteroids[i]<0 && stack.peek()>0){
                
                //if coming asteroid is greater than previous
                if(Math.abs(asteroids[i])>Math.abs(stack.peek())){
                    stack.pop();
                    continue;
                }

                //is same size
                else if(Math.abs(asteroids[i])==stack.peek()){
                    stack.pop();
                }

                //if in same direction OR -ve coming is less than previous +ve
                same=true;
                break;
            }   

            if(!same){
                stack.push(asteroids[i]);
            }
        }

        int [] result=new int[stack.size()];
        for(int i=stack.size()-1;i>=0;i--){
            result[i]=stack.pop();
        }

        return result;
    }
}