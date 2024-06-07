class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;

        //declaring a map:
        HashMap<Integer, Integer> map = new HashMap<>();

        //storing the elements with its occurnce:
        for (int i = 0; i < n; i++) {
            int value = map.getOrDefault(nums[i], 0);
            map.put(nums[i], value + 1);
        }

        //searching for the majority element:
        //Map.Entry is an interface representing an entry (key-value pair) in a map.
        //it - loop variable
        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            if (it.getValue() > (n/2)) {
                return it.getKey();
            }
        }

        return -1;
    }
}