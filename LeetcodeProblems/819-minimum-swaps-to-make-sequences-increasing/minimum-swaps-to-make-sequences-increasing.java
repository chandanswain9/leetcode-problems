class Solution {
    public int minSwap(int[] nums1, int[] nums2) {
        int n = nums1.length;
        
        int curNoSwap = 0, curSwap = 1;
        
        for (int i = 1; i < n; i++) {
            int prevNoSwap = curNoSwap, prevSwap = curSwap;
            
            curNoSwap = Integer.MAX_VALUE;
            curSwap = Integer.MAX_VALUE;
            
            if (nums1[i] > nums1[i - 1] && nums2[i] > nums2[i - 1]) {
                curNoSwap = prevNoSwap;
                curSwap = 1 + prevSwap;
            }
            
            if (nums1[i] > nums2[i - 1] && nums2[i] > nums1[i - 1]) {
                curNoSwap = Math.min(curNoSwap, prevSwap);
                curSwap = Math.min(curSwap, 1 + prevNoSwap);
            }
        }
        
        return Math.min(curNoSwap, curSwap);
    }
}