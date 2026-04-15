class Solution {
    public int lengthOfLastWord(String s) {
        int textLength = s.length();
        int lengthOfLastWord = 0;

        for(int i = textLength - 1; i >= 0; i--){
            if(s.charAt(i) != ' '){
                lengthOfLastWord++;
            }

            if(s.charAt(i) == ' ' && lengthOfLastWord > 0){
                break;
            }
        }

        return lengthOfLastWord;
    }
}
