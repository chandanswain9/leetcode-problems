class Solution {
    public int possibleStringCount(String word) {
        int tot = 1;
        int n = word.length();
        int i = 0;

        while(i < n) {
            int j = i;
            while(j < n && word.charAt(i) == word.charAt(j)){
                j++;
            }
            int count = j - i;
            if(count > 1) {
                tot += count - 1;
            }
            i = j;
        }
        return tot;
    }
}