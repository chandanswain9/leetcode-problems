class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        for (int[] box : boxTypes) {
            maxHeap.offer(box);
        }

        int totalUnits = 0;

        while (!maxHeap.isEmpty() && truckSize > 0) {
            int[] box = maxHeap.poll();
            int boxCount = box[0];
            int unitsPerBox = box[1];

            int boxesToTake = Math.min(truckSize, boxCount);
            totalUnits += boxesToTake * unitsPerBox;
            truckSize -= boxesToTake;
        }

        return totalUnits;
    }
}