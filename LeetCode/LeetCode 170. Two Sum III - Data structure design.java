class TwoSum {
    List<Integer> list;
    Boolean isSorted;

    public TwoSum() {
        list = new ArrayList<>();
        isSorted = false;
    }
    
    public void add(int number) {
        list.add(number);
        isSorted = false;
    }
    
    public boolean find(int value) {
        if(!isSorted){
            Collections.sort(list);
            isSorted = true;
        }

        int leftPointer = 0, rightPointer = list.size() - 1;

        while(leftPointer < rightPointer){
            int sum = list.get(leftPointer) + list.get(rightPointer); 
            
            if(sum == value){
                return true;
            } else if(sum > value){
                rightPointer--;
            } else{
                leftPointer++;
            }
        }

        return false;
    }
}

/**
 * Your TwoSum object will be instantiated and called as such:
 * TwoSum obj = new TwoSum();
 * obj.add(number);
 * boolean param_2 = obj.find(value);
 */
