class Solution {
    public String reversePrefix(String word, char ch) {
        if( word.length() == 1 || !word.contains(Character.toString(ch))) {
            return word;
        }
        StringBuilder str = new StringBuilder("");
        int idx = word.indexOf(ch);
        int temp = idx;
        for(int i =idx; i >= 0; i--){
            str.append(word.charAt(i));
        }
        str.append(word.substring(temp+1));
        return str.toString();
    }
}