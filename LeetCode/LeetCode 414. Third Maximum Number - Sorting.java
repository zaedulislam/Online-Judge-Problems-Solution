class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        for(int i = 0; i < n / 2; i++){
            int temp = nums[i];
            nums[i] = nums[n - 1 - i];
            nums[n - 1 - i] = temp;
        }

        int previousElement = nums[0];
        int elementCounted = 1;

        for(int i = 1; i < n; i++){
            if(previousElement != nums[i]){
                previousElement = nums[i];
                elementCounted++;
            }

            if(elementCounted == 3){
                return previousElement;
            }
        }

        return nums[0];
    }
}
