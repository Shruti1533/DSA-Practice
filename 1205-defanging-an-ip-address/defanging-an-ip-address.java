class Solution {
    public String defangIPaddr(String address) {
        StringBuilder ans=new StringBuilder();

        for(int i=0;i<address.length();i++){
            char b=address.charAt(i);

            if(b=='.'){
                ans.append("[.]");
            }
            else{
                ans.append(b);
            }
        }

        return ans.toString();
    }
}