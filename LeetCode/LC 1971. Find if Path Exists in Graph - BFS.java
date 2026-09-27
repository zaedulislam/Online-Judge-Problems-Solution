class Solution {
    public static List<List<Integer>> constructGraph(int n, int[][] edges){
        List<List<Integer>> graph = new ArrayList<>();

        for(int i = 0; i < n; i++){
            graph.add(new ArrayList<>());
        }

        for(int[] edge: edges){
            int u = edge[0];
            int v = edge[1];

            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        
        return graph;
    }

    public static boolean bfs(int n, int source, int destination, List<List<Integer>> graph){
        Queue<Integer> queue = new ArrayDeque<>();
        boolean[] visited = new boolean[n];

        queue.add(source);
        visited[source] = true;

        while(!queue.isEmpty()){
            int u = queue.poll();

            if(u == destination){
                return true;
            }

            for(int v: graph.get(u)){
                if(!visited[v]){
                    visited[v] = true;
                    queue.add(v);
                }
            }
        }

        return false;
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph = constructGraph(n, edges);
        
        return bfs(n, source, destination, graph);
    }
}
