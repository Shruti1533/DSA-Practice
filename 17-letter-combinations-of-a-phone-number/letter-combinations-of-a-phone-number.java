import java.util.*;

class Solution {
    private static final String[] mappings = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        if(digits.length()==0){
            List <String> result=new ArrayList<>();
            return result;
        }
        else{
            return helper(digits);
        }

    }

    public List<String> helper(String digits) {
        //Base case
        if(digits.length()==0){
            List <String> result=new ArrayList<>();
            result.add("");//We do this so it's traversable
            return result;
        }

        //New list
        List <String> f=new ArrayList<>();

        char fc=digits.charAt(0);
        int index=fc-'0';
        String letter=mappings[index];//abc

        //Traverse abc
        for(int i=0;i<letter.length();i++){

            List<String> small=helper(digits.substring(1));//For 3
            for(int j=0;j<small.size();j++){
                f.add(letter.charAt(i)+small.get(j));
            }
        }
        return f;
    }
}
