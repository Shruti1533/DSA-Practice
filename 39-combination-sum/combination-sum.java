class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> output=new ArrayList<>();
        solve(candidates,0,target,output,ans);
        return ans;
    }

    public void solve(int[] nums, int index, int target, ArrayList<Integer> output, List<List<Integer>> ans) {
        if (target == 0) {
            ans.add(new ArrayList<>(output));
            return;
        }

        if (target < 0 ) {
            return;
        }

        for(int i=index;i<nums.length;i++){
            output.add(nums[i]);
            solve(nums, i, target - nums[i], output, ans);
            output.remove(output.size() - 1);
        }
    }
}