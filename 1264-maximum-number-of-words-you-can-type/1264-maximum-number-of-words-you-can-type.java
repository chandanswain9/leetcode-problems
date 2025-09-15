class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        Set<Character> brokenSet = new HashSet<>();
        for (char c : brokenLetters.toCharArray()) {
            brokenSet.add(c);
        }

        int count = 0;
        String[] words = text.split(" ");
        for (String word : words) {
            boolean canType = true;
            for(char c : word.toCharArray()) {
                if(brokenSet.contains(c)) {
                    canType = false;
                    break;
                }
            }
            if(canType) count++;
        }
        return count;
    }
}