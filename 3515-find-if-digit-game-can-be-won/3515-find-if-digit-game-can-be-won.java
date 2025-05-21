class Solution {
    public boolean canAliceWin(int[] nums) {
        int sumSingle = 0;
        int sumDouble = 0;
        int sumTotal = 0;

        for(int num : nums) {
            sumTotal += num;
            if(num < 10) {
                sumSingle += num;
            } else {
                sumDouble += num;
            }
        }
        
        int sumBobSingle = sumTotal - sumSingle;
        int sumBobDouble = sumTotal - sumDouble;

        return sumSingle > sumBobSingle || sumDouble > sumBobDouble;
    }
}