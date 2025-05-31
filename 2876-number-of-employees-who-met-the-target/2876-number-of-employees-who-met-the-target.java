class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int n = hours.length;
        int count = 0;
        for(int num : hours){
            if(num >= target) {
                count++;
            }
        }
        return count;
    }
}