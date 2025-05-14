class Solution {
    public int minOperations(String s) {
        int start0 = 0, start1 = 0;
        for(int i = 0; i < s.length(); i++) {
            if(i % 2 == 0 && s.charAt(i) == '1') start0++;
            else if(i % 2 == 1 && s.charAt(i) == '0') start0++;

            if(i % 2 == 0 && s.charAt(i) == '0') start1++;
            else if(i % 2 == 1 && s.charAt(i) == '1') start1++;
        }
        return Math.min(start0,start1);
    }
}