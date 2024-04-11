class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap <Character,Character> map=new HashMap<>();
        boolean ans=false;
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char b=s.charAt(i);
            char c=t.charAt(i);
            if(!map.containsKey(b)){
                if(!map.containsValue(c)){
                    map.put(b,c);
                }
                else{
                    return false;
                }
            }
            else{
                char mapped=map.get(b);
                if(mapped!=c){
                    return false;
                }
            }
            
        }
        return true;
    }
}