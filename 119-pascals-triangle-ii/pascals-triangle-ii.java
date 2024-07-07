class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result=new ArrayList<>();
        for(int col=0;col<=rowIndex;col++){
            int val=(int) nCr(rowIndex,col);
            result.add(val);
        }

        return result;
    }

    public static long nCr(int n,int r){
        long res=1;

        for(int i=0;i<r;i++){
            res=res*(n-i);
            res=res/(i+1);
        }
        return res;
    }
}