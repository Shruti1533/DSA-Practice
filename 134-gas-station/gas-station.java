class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int less_gas=0;
        int tank=0;
        int index=0;

        for(int i=0;i<gas.length;i++){
            tank+=gas[i]-cost[i];
            if(tank<0){
                less_gas=less_gas+tank;//how much is less (-ve values)
                tank=0;
                index=i+1;
            }
        }

        if(less_gas+tank>=0){
            return index;
        }
        else{
            return -1;
        }
    }
}