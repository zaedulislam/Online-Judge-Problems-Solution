class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        int size = nums.length;
        for(int i = 0; i < size; i++){
            int complement = target - nums[i];

            if(map.containsKey(complement)){
                return new int[] {i, map.get(complement)};
            }

            map.put(nums[i], i);
        }

        return new int[] {};
    }
}
