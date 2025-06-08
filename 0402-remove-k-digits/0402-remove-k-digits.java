class Solution {
    public String removeKdigits(String num, int k) {
        Deque<Character> stack = new ArrayDeque<>();

        for(char dig : num.toCharArray()) {
            while(!stack.isEmpty() && k > 0 && stack.peekLast() > dig){
                stack.removeLast();
                k--;
            }
            stack.addLast(dig);
        }
         while (k-- > 0) {
            stack.removeLast();
        }
        StringBuilder res = new StringBuilder();
        boolean zero = true;
        for(char dig : stack) {
            if(zero && dig == '0') continue;
            zero = false;
            res.append(dig);
        }
        if(res.length() == 0){
            return "0";
        }else {
            return res.toString();
        }
    }
}