class Solution {
    public int minPartitions(String n) {
        int maxDig = 0;

        for(char c : n.toCharArray()) {
            int digit = c - '0';
            if(digit > maxDig) {
                maxDig = digit;
                if(maxDig == 9) {
                    break;
                }
            }
        }
        return maxDig;
    }
}