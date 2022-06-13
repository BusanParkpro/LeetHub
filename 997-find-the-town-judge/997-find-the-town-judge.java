import java.util.Arrays;

class Solution {
    public int findJudge(int n, int[][] trust) {
        if (trust.length < 0) {
            return -1;
        }
        
        for(int i = 1; i <= n; i++) {
            int finalI = i;
            if(Arrays.stream(trust).
                    noneMatch(x -> x[0] == finalI) &&
            Arrays.stream(trust).
                    filter(x -> x[1] == finalI).
                    count() == (n - 1)) {
                return finalI;
            }
        }
        return -1;
    }
}