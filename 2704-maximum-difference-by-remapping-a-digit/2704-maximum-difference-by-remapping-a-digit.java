class Solution {
    private int maxVal(String s) {
        char target = 0;
        for (char c : s.toCharArray()) {
            if(c != '9') {
                target = c;
                break;
            }
        }
        if(target == 0){
            return Integer.parseInt(s);
        }
        return Integer.parseInt(s.replace(target, '9'));
    }

    private int minVal(String s) {
        char target = s.charAt(0);
        return Integer.parseInt(s.replace(target, '0'));
    }

    public int minMaxDifference(int num) {
        String s = String.valueOf(num);
        int max = maxVal(s);
        int min = minVal(s);
        return max - min;
    }
}