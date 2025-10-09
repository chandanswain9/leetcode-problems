class Solution {
    private static void backtrack(List<String> result, StringBuilder current, String digits, int index, String[] map) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }
        String letters = map[digits.charAt(index) - '0'];
        for (char c : letters.toCharArray()) {
            current.append(c);
            backtrack(result, current, digits, index + 1, map);
            current.deleteCharAt(current.length() - 1);
        }
    }

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0)
            return result;
        String[] map = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        backtrack(result, new StringBuilder(), digits, 0, map);
        return result;
    }
}