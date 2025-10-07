class Solution {
    public int[] avoidFlood(int[] rains) {
        int n = rains.length;
        int[] ans = new int[n];
        HashMap<Integer, Integer> full = new HashMap<>();
        TreeSet<Integer> dryDays = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            if (rains[i] == 0) {
                dryDays.add(i);
                ans[i] = 1;
            } else {
                int lake = rains[i];
                ans[i] = -1;

                if (full.containsKey(lake)) {
                    Integer dryDay = dryDays.higher(full.get(lake));
                    if (dryDay == null) {
                        return new int[0];
                    }
                    ans[dryDay] = lake;
                    dryDays.remove(dryDay);
                }

                full.put(lake, i);
            }
        }
        return ans;
    }
}