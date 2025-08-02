class Solution {
    public long minCost(int[] basket1, int[] basket2) {
        Map<Integer, Integer> freq = new TreeMap<>();
        for(int fruit : basket1) {
            freq.put(fruit, freq.getOrDefault(fruit, 0) + 1);                                
        }
        for(int fruit : basket2) {
            freq.put(fruit, freq.getOrDefault(fruit, 0) - 1); 
        }
        List<Integer> mismatch = new ArrayList<>();
        int globalMin = Integer.MAX_VALUE;

        for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
            int fruit = entry.getKey();
            int count = entry.getValue();
            if(count % 2 != 0) return -1;

            globalMin = Math.min(globalMin , fruit);
            for(int i = 0; i < Math.abs(count / 2); i++) {
                mismatch .add(fruit);
            }
        }
        Collections.sort(mismatch);
        long cost = 0;
        for(int i = 0; i < mismatch.size()/2 ; i++) {
            cost += Math.min(mismatch.get(i),2 * globalMin);
        }
        return cost;
    }
}