class NumArray {
    int[] cumulativeSum;

    public NumArray(int[] nums) {
        cumulativeSum = new int[nums.length];

        cumulativeSum[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            cumulativeSum[i] = cumulativeSum[i - 1] + nums[i];
        }    
    }
    
    public int sumRange(int left, int right) {
        if(left == 0 || right == 0){
            return cumulativeSum[right];
        }

        return cumulativeSum[right] - cumulativeSum[left - 1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
