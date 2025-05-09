class Solution {
    public String reversePrefix(String word, char ch) {
        if( word.length() == 1 || !word.contains(Character.toString(ch))) {
            return word;
        }
        StringBuilder str = new StringBuilder("");
        int idx = word.indexOf(ch);
        int temp = idx;
        while(idx >= 0) {
            str.append(word.charAt(idx));
            idx--;
        }
        str.append(word.substring(temp+1));
        return str.toString();
    }
}