class Solution {
    public int findLucky(int[] arr) {
        int[] freq = new int[501];
        int maxLucky = -1;

        for (int num : arr) {
            freq[num]++;
        }
        
        for (int i = 1; i <= 500; i++) {
            if (freq[i] == i) {
                maxLucky = i;
            }
        }

        return maxLucky;
    }
}