class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int n = nums.length / 2;
        int majorityElement = 0;

        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);

            if(map.get(num) > n){
                majorityElement = num;
            }
        }

        return majorityElement;
    }
}
