class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();

        for(int num: nums){
            if(hashSet.contains(num)){
                continue;
            }

            if(minHeap.size() == 3){
                if(num > minHeap.peek()){
                    minHeap.poll();
                    minHeap.add(num);
                }

                hashSet.add(num);
            }else{
                minHeap.add(num);
                hashSet.add(num);
            }
        }

        if(minHeap.size() < 3){
            int ans = 0;
            while(!minHeap.isEmpty()){
                ans = minHeap.peek();
                minHeap.poll();
            }

            return ans;
        }

        return minHeap.peek();
    }
}
