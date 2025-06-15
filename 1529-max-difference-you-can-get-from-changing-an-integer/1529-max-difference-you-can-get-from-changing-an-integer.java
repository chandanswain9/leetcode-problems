class Solution {
    private int findMax(StringBuilder maxStr, String str){
        char maxDig = ' ';
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != '9') {
                maxDig = str.charAt(i);
                break;
            }
        }
        if(maxDig != ' '){
            for(int i = 0; i < maxStr.length(); i++) {
                if(maxStr.charAt(i) == maxDig) {
                    maxStr.setCharAt(i, '9');
                }
            }
        }
        return Integer.parseInt(maxStr.toString());
    }
    private int findMin(StringBuilder minStr, String str) {
        char minDigit = str.charAt(0);
        char replace = '1';

        if (minDigit == '1') {
            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) != '0' && str.charAt(i) != '1') {
                    minDigit = str.charAt(i);
                    replace = '0';
                    break;
                }
            }
        }

        for (int i = 0; i < minStr.length(); i++) {
            if (minStr.charAt(i) == minDigit) {
                minStr.setCharAt(i, replace);
            }
        }
        return Integer.parseInt(minStr.toString());
    }
    public int maxDiff(int num) {
        String str = Integer.toString(num);
        StringBuilder maxStr = new StringBuilder(str);
        StringBuilder minStr = new StringBuilder(str);        
        int maxVal = findMax(maxStr, str);
        int minVal = findMin(minStr, str);

        return maxVal - minVal;
    }
}