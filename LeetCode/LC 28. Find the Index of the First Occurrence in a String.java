class Solution {
    public int strStr(String haystack, String needle) {
        int lengthOfHaystack = haystack.length();
        int lengthOfNeedle = needle.length();

        for(int i = 0; i + lengthOfNeedle - 1 < lengthOfHaystack; i++){
            for(int j = 0; j < lengthOfNeedle; j++){
                if(haystack.charAt(i + j) != needle.charAt(j)){
                    break;
                }

                if(j == lengthOfNeedle - 1){
                    return i;
                }
            }
        }

        return -1;
    }
}
