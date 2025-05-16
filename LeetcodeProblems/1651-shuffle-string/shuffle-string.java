class Solution {
    public String restoreString(String s, int[] indices) {
        char[] arr = new char[indices.length];
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < arr.length; i++) {
            arr[indices[i]] = s.charAt(i);
        }
        for(int i = 0; i < arr.length; i++) {
            str.append(arr[i]);
        }
        return str.toString();
    }
}