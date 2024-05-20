class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> small=new ArrayList<>();
        List<List<Integer>> fin=new ArrayList<>();

        helper(nums,small,fin);
        return fin;
    }

    public static void helper(int nums[], List<Integer> small, List<List<Integer>> fin){

        //Base case
        if(nums.length==small.size()){
            //Since reference is passed so alterations will show if done like this fin.add(small);
            //therefore a copy is to me made-->
            fin.add(new ArrayList(small));
            
        }

        //Iterate over each element
        for(int i=0;i<nums.length;i++){
            if(!small.contains(nums[i])){
                small.add(nums[i]);
                helper(nums,small,fin);

                //Undo operation
                small.remove(small.size()-1);
            }

            
        }
    }
}