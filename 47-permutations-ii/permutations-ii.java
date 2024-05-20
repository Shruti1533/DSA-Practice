class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List <Integer> small=new ArrayList<>();
        List<List<Integer>> fin = new ArrayList<>();
        boolean[] used = new boolean[nums.length];

        backtrack(fin, small, nums, used);

        return fin;
    }

    private void backtrack(List<List<Integer>> fin, List<Integer> small, int[] nums, boolean[] used) {
        // Base case
        if (small.size() == nums.length) {
            fin.add(new ArrayList<>(small));
        } 
        
        else {
            // Iterate over all elements in nums
            for (int i = 0; i < nums.length; i++) {
                // Skip already used elements or duplicates
                if (used[i] || (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])) {
                    continue;
                }

                used[i] = true;
                small.add(nums[i]);

                
                backtrack(fin, small, nums, used);

                // Backtrack
                used[i] = false;
                small.remove(small.size() - 1);
            }
        }
    }
}
