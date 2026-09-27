class Solution {
    public int findCenter(int[][] edges) {
        Map<Integer, Integer> indegreeMap = new HashMap<>();

        for(int[] edge: edges){
            int u = edge[0];
            int v = edge[1];
            
            indegreeMap.put(u, indegreeMap.getOrDefault(u, 0) + 1);
            indegreeMap.put(v, indegreeMap.getOrDefault(v, 0) + 1);
        }

    
        int centerNode = -1;
        for (Map.Entry<Integer, Integer> entry : indegreeMap.entrySet()) {
            int node = entry.getKey();
            int indegree = entry.getValue();

            if(indegree == edges.length){
                centerNode = node;
                break;
            }
        }

        return centerNode;
    }
}
