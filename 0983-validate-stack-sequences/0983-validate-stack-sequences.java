class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int i = -1;
        int j = 0;
        for (int p : pushed) {
            pushed[++i] = p;
            while (i >= 0 && j < popped.length && pushed[i] == popped[j]) {
                i--;
                j++;
            }

        }
        return i == -1 && j == popped.length;
    }
}