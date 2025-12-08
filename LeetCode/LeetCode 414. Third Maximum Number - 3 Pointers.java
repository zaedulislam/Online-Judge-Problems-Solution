class Solution {
    public int thirdMax(int[] nums) {
        long firstMax = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;

        for(int num: nums){
            if(num > firstMax){
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;
            }
            if(num < firstMax && num > secondMax){
                thirdMax = secondMax;
                secondMax = num;
            }
            if(num < secondMax && num > thirdMax){
                thirdMax = num;
            }
        }


        return thirdMax == Long.MIN_VALUE ? (int) firstMax : (int) thirdMax;
    }
}
