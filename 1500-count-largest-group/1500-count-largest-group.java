class Solution {
    private int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public int countLargestGroup(int n) {
        int count = 0;
        int maxSize = 0;
        HashMap<Integer, Integer> group = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            int sum = digitSum(i);
            group.put(sum, group.getOrDefault(sum, 0) + 1);
        }
        for (int size : group.values()) {
            maxSize = Math.max(maxSize, size);
        }
        for (int size : group.values()) {
            if (size == maxSize) {
                count++;
            }
        }
        return count;
    }
}