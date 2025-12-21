class Solution {
    public int thirdMax(int[] nums) {
        Pair<Integer, Boolean> firstMax = new Pair<Integer, Boolean>(Integer.MIN_VALUE, false);
        Pair<Integer, Boolean> secondMax = new Pair<Integer, Boolean>(Integer.MIN_VALUE, false);
        Pair<Integer, Boolean> thirdMax = new Pair<Integer, Boolean>(Integer.MIN_VALUE, false);

        for(int num: nums){
            if ((firstMax.getValue() && firstMax.getKey() == num) || 
                (secondMax.getValue() && secondMax.getKey() == num) || 
                (thirdMax.getValue() && thirdMax.getKey() == num)) {
                continue;
            }

            if(!firstMax.getValue() || num > firstMax.getKey()){
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = new Pair<Integer, Boolean> (num, true);
            }else if(!secondMax.getValue() || num > secondMax.getKey()){
                thirdMax = secondMax;
                secondMax = new Pair<Integer, Boolean> (num, true);
            }else if(!thirdMax.getValue() || num > thirdMax.getKey()){
                thirdMax = new Pair<Integer, Boolean> (num, true);
            }
        }

        if(!thirdMax.getValue()){
            return firstMax.getKey();
        }

        return thirdMax.getKey();
    }
}
