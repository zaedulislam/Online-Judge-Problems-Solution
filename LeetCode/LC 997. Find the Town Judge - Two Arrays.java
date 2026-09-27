class Solution {
    public int findJudge(int n, int[][] trust) {
        if(trust.length < n - 1){
            return -1;
        }

        int[] indegrees = new int[n + 1];
        int[] outdegrees = new int[n + 1];

        for(int[] relation: trust){
            outdegrees[relation[0]]++;
            indegrees[relation[1]]++;
        }

        for(int i = 1; i <= n; i++){
            if(outdegrees[i] == 0 && indegrees[i] == n - 1){
                return i;
            }
        }

        return -1;
    }
}
