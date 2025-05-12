class Solution {
    public char kthCharacter(int k) {
        StringBuilder res = new StringBuilder("a");
        while(res.length() < k) {
            StringBuilder temp = new StringBuilder();
            for(int i = 0; i < res.length(); i++) {
                char newChar = (res.charAt(i) == 'z') ? 'a' : (char) (res.charAt(i)+1);
                temp.append(newChar);
            }
            res.append(temp);
        }
        return res.charAt(k-1);
        // return (char)('a'-Integer.bitCount(k-1));
    }
}