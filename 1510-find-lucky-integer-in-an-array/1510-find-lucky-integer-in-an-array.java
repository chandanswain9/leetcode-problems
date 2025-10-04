class Solution {
    public int findLucky(int[] arr) {
        int maxLucky = -1;

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr ) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int key : map.keySet()) {
            if (key == map.get(key)) {
                maxLucky = Math.max(maxLucky, key);
            }
        }

        return maxLucky;
    }
}