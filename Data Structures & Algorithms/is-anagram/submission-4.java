class Solution {
    public boolean isAnagram(String s, String t) {

       if(s.length() != t.length()){
        return false;
       }

       int[] contains= new int[26];

       for(int i=0;i<s.length();i++){

        contains[s.charAt(i) - 'a']++;
        contains[t.charAt(i) - 'a']--;
       }

       for(int value: contains){
        if(value !=0){
    
            return false;
        }
       }

       return true;



    }
}
