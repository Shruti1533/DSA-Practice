class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack <Integer> stack=new Stack<>();
        HashMap <Integer,Integer> map=new HashMap<>();

        for(int i=nums2.length-1;i>=0;i--){

            while(!stack.isEmpty() && stack.peek()<=nums2[i]){
                stack.pop();
            }

            // If stack is not empty, the next greater element is at the top of the stack
            if (!stack.isEmpty()) {
                map.put(nums2[i], stack.peek());
            } 
            
            else {
                // Otherwise, there is no greater element
                map.put(nums2[i], -1);
            }

            stack.push(nums2[i]);
        }

        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.getOrDefault(nums1[i], -1);
        }

        return result;
    }
}
