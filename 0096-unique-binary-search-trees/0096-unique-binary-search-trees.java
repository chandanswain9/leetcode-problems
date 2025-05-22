class Solution {
    public int numTrees(int n) {
        int[] demo = new int[n+1];
        demo[0] = 1;
        demo[1] = 1;

        for(int nodes = 2; nodes <= n; nodes++) {
            for(int root = 1; root <= nodes; root++) {
                int left = root - 1;
                int right = nodes - root;
                demo[nodes] += demo[left] * demo[right];
            }
        }
        return demo[n];
    }
}