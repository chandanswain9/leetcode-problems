class Solution {
    public String sortVowels(String s) {
        Set<Character> vowels = new HashSet<>(Arrays.asList(
            'a','e','i','o','u','A','E','I','O','U'
        ));
        List<Character> vowelList = new ArrayList<>();
        for (char ch : s.toCharArray()) {
            if (vowels.contains(ch)) {
                vowelList.add(ch);
            }
        }
        Collections.sort(vowelList);
        StringBuilder result = new StringBuilder();
        int idx = 0;
        for (char ch : s.toCharArray()) {
            if (vowels.contains(ch)) {
                result.append(vowelList.get(idx++));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
}