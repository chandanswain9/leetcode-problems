class Solution {
    public boolean digitCount(String num) {
        int[] count = new int[10];

        for(char ch : num.toCharArray()) {
            count[ch - '0']++;
        }

        for(int  i = 0; i < num.length(); i++) {
            if(count[i] != num.charAt(i) - '0') {
                return false;
            }
        }
        return true;
    }
}