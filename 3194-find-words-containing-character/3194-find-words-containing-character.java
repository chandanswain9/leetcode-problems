class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> res = new ArrayList<>();
        String c =Character.toString(x);;
        for(int i = 0;i < words.length; i++) {
            if(words[i].contains(c)){
                res.add(i);
            }
        }
        return res;
    }
}