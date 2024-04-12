class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> small=new ArrayList<>();
        List<List<Integer>> fin=new ArrayList<>();

        combineHelper(n,k,1,small,fin);
        return fin;
    }

    static void combineHelper(int n,int k,int index,List<Integer> small,List<List<Integer>> fin)  {
        if(small.size()==k){
            fin.add(new ArrayList(small));
            return;
        }
        //fin.add(new ArrayList(small));
        for(int i=index;i<=n;i++){
            if(!small.contains(i)){
                small.add(i);
                combineHelper(n,k,i,small,fin);
                small.remove(small.size()-1);
            }
        }
    }
}