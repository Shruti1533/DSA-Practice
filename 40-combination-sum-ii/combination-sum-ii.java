import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> fin = new ArrayList<>();
        Arrays.sort(candidates); // Sort the candidates array to handle duplicates properly
        sum2Helper(candidates, target, 0, new ArrayList<>(), fin);
        return fin;
    }

    public void sum2Helper(int[] candidates, int target, int index, List<Integer> small, List<List<Integer>> fin) {
        if (target == 0) {
            fin.add(new ArrayList<>(small));
            return;
        }

        if (target < 0 || index >= candidates.length) { 
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            if (i > index && candidates[i] == candidates[i - 1]) {
                continue; // Skip duplicates
            }
            small.add(candidates[i]);
            sum2Helper(candidates, target - candidates[i], i + 1, small, fin);
            small.remove(small.size() - 1);
        }
    }
}

