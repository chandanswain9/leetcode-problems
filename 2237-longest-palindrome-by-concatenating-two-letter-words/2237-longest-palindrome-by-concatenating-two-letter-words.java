class Solution {
    public int longestPalindrome(String[] words) {
        Map<String, Integer> count = new HashMap<>();
        int result = 0;
        boolean oddMiddle = false;

        for (String w : words) {
            count.put(w, count.getOrDefault(w, 0) + 1);
        }

        for (String w : count.keySet()) {
            String rev = "" + w.charAt(1) + w.charAt(0);
            int c1 = count.getOrDefault(w, 0);
            int c2 = count.getOrDefault(rev, 0);

            if (w.equals(rev)) {
                result += (c1 / 2) * 4;
                if (!oddMiddle && c1 % 2 == 1) {
                    result += 2;
                    oddMiddle = true;
                }
            } else if (w.compareTo(rev) < 0) {
                int pairs = Math.min(c1, c2);
                result += pairs * 4;
            }
        }

        return result;
    }
}