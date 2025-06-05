class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> result = new ArrayList<>();
        int current = 1;
        int i = 0;

        while (i < target.length) {
            if (current == target[i]) {
                result.add("Push");
                i++;
            } else {
                result.add("Push");
                result.add("Pop");
            }
            current++;
        }
        return result;
    }
}