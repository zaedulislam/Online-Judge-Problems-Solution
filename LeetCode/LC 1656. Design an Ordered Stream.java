class OrderedStream {
    int currentLowestId;
    HashMap<Integer, String> hashMap;

    public OrderedStream(int n) {
        this.currentLowestId = 1;
        this.hashMap = new HashMap<>();
    }
    
    public List<String> insert(int idKey, String value) {
        List<String> orderedStream = new ArrayList<>();

        hashMap.put(idKey, value);

        if(idKey == currentLowestId){
            while(hashMap.containsKey(currentLowestId)){
                orderedStream.add(hashMap.get(currentLowestId));
                currentLowestId++;
            }
        }

        return orderedStream;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */
