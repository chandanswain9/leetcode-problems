class Solution {
    private static int winner(int n, boolean left) {
        if(n == 1) return 1;
        if(n % 2 == 1 || left) {
            return 2 * winner(n / 2, !left);
        } else {
            return 2 * winner(n / 2, !left) - 1;
        }
    }
    public int lastRemaining(int n) {
        return winner(n, true);
    }
}