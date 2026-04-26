class Solution {
    public boolean isSubsequence(String s, String t) {
        int lengthOfS = s.length();
        int lengthOfT = t.length();
        
        int i = 0;
        for(int j = 0; j < lengthOfT; j++){
            if(i < lengthOfS && (s.charAt(i) == t.charAt(j))){
                i++;
            }
        }

        return i == lengthOfS ? true : false;
    }
}
