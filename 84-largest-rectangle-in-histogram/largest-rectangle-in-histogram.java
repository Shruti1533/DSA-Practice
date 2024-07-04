class Solution {
    public int largestRectangleArea(int[] heights) {
        int h=heights.length;
        int [] ns=new int[h];
        int [] ps=new int[h];

        Stack <Integer> stack=new Stack<>();
        
        for(int i=h-1;i>=0;i--){
            while(!stack.isEmpty() && heights[i]<=heights[stack.peek()]){
                stack.pop();
            }

            if(!stack.isEmpty()){
                ns[i]=stack.peek();
            }
            else if(stack.isEmpty()){
                ns[i]=h;
            }
            
            stack.push(i);
        }

        stack.clear();

        
        for(int i=0;i<h;i++){
            while(!stack.isEmpty() && heights[i]<=heights[stack.peek()]){
                stack.pop();
            }
            
            if(!stack.isEmpty()){
                ps[i]= stack.peek();
            }
            else if(stack.isEmpty()){
                ps[i]=-1;
            }
            
            stack.push(i);
        }


        int[] area=new int[heights.length];
        int largest=Integer.MIN_VALUE;

        for(int i=0;i<heights.length;i++){
            int width = ns[i] - ps[i] - 1;
            int a = heights[i] * width;
            largest = Math.max(largest, a);
        }

        return largest;
    }
}