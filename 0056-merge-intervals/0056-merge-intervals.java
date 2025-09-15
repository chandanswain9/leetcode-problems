class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals == null || intervals.length == 0) {
            return new int[0][0];
        } 

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();
        
        int[] curr = intervals[0];
        merged.add(curr);

        for(int i = 1; i < intervals.length; i++) {
            int[] next = intervals[i];

            if(curr[1] < next[0]) {
                curr = next;
                merged.add(curr);
            } else {
                curr[1] = Math.max(curr[1], next[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}