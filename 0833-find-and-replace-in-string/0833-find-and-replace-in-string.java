class Solution {
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        int n = s.length();
        int[] match = new int[n];
        for (int i = 0; i < n; i++) {
            match[i] = -1;
        }
        for (int i = 0; i < indices.length; i++) {
            int idx = indices[i];
            if (s.startsWith(sources[i], idx)) {
                match[idx] = i;
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; ) {
            if (match[i] != -1) {
                int j = match[i];
                result.append(targets[j]);
                i += sources[j].length();  // skip source
            } else {
                result.append(s.charAt(i));
                i++;
            }
        }
        return result.toString();
    }
}