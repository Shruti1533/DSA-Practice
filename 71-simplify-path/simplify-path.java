class Solution {
    public String simplifyPath(String path) {
        StringBuilder str=new StringBuilder();

        Stack <String> s=new Stack<>();

        String[] arr = path.split("/");
        for(int i=0;i<arr.length;i++){
            
            if(arr[i].equals(".") || arr[i].isEmpty()){
                continue;
            }
            else if(arr[i].equals("..") ){
                if(!s.isEmpty()){
                    s.pop();
                }
            }
            else{
                s.push(arr[i]);
            }
        }

        for(String dir: s){
            str.append("/").append(dir);
        }

        return str.length() > 0 ? str.toString(): "/";
    }
}