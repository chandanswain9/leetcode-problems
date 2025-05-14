class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int lt = 0, rt = arr.length - 1;
        while(rt - lt >= k){
            if(Math.abs(arr[lt] - x) > Math.abs(arr[rt] - x)){
                lt++;
            }else {
                rt--;
            }
        }
        List<Integer> res = new ArrayList<>(k);
        for(int i = lt; i <= rt; i++){
            res.add(arr[i]);
        }
        return res;
    }
}