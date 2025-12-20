class Solution {
    public int thirdMax(int[] nums) {
       TreeSet<Integer> set = new TreeSet<Integer>();

       for(int num: nums){
            if(set.contains(num)){
                continue;
            }

            if(set.size() == 3){
                if(num > set.first()){
                    set.pollFirst();
                    set.add(num);
                }
            }else{
                set.add(num);
            }
       } 

       if(set.size() == 3){
            return set.first();            
       }

       return set.last();
    }
}
