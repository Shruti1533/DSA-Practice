class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> small=new ArrayList<>();
        List<List<Integer>> fin=new ArrayList<>();
        subsetHelper(nums,0,small,fin);

        return fin;
    }

    static void subsetHelper(int[] nums, int index, List<Integer> small,List<List<Integer>> fin){
        fin.add(new ArrayList(small));
        for(int i=index;i<nums.length;i++){
            if(!small.contains(nums[i])){
                small.add(nums[i]);
                subsetHelper(nums,i,small,fin);
                small.remove(small.size()-1);
            }
        }
    }
}