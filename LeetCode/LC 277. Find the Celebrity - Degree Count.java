/* The knows API is defined in the parent class Relation.
      boolean knows(int a, int b); */

public class Solution extends Relation {
    public int findCelebrity(int n) {
        int[] degrees = new int[n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i != j){
                    if(knows(i, j)){
                        degrees[j]++;
                        degrees[i]--;
                    }
                }
            }
        }

        for(int i = 0; i < n; i++){
            if(degrees[i] == n - 1){
                return i;
            }
        }

        return -1;
    }
}
