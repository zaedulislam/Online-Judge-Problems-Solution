class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        
        int missingNumber = n;
        
        for(int i = 0; i < n; i++){
            missingNumber = missingNumber ^ (i ^ nums[i]);
        }


        return missingNumber;
    }
}
