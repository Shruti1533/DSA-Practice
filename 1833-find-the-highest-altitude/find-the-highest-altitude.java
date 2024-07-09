class Solution {
    public int largestAltitude(int[] gain) {
        int a[]=new int[gain.length+1];
        int ans=0;

        a[0]=0;
        for(int i=1;i<=gain.length;i++){
            a[i]=a[i-1]+gain[i-1];
        }

        for(int i=0;i<a.length;i++){
            ans=Math.max(ans,a[i]);
        }
        if(ans<0){
            return 0;
        }
        return ans;
    }
}