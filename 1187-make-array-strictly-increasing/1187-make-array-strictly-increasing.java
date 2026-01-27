import java.util.*;

class Solution {
    public int makeArrayIncreasing(int[] arr1, int[] arr2) {
        Arrays.sort(arr2);
        Map<Integer, Integer> dp = new HashMap<>();
        dp.put(-1, 0);

        for (int a : arr1) {
            Map<Integer, Integer> newDp = new HashMap<>();
            for (int prev : dp.keySet()) {
                int cost = dp.get(prev);
                if (a > prev) {
                    newDp.put(a, Math.min(newDp.getOrDefault(a, Integer.MAX_VALUE), cost));
                }
                int idx = upperBound(arr2, prev);
                if (idx < arr2.length) {
                    int val = arr2[idx];
                    newDp.put(val, Math.min(newDp.getOrDefault(val, Integer.MAX_VALUE), cost + 1));
                }
            }
            dp = newDp;
            if (dp.isEmpty()) return -1;
        }

        int res = Integer.MAX_VALUE;
        for (int v : dp.values()) res = Math.min(res, v);
        return res;
    }

    private int upperBound(int[] arr, int target) {
        int l = 0, r = arr.length;
        while (l < r) {
            int m = (l + r) / 2;
            if (arr[m] <= target) l = m + 1;
            else r = m;
        }
        return l;
    }
}
