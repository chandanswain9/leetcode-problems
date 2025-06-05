class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for(String op : operations) {
            if(op.equals("C")) {
                stack.pop();
            }else if(op.equals("D")) {
                stack.push(2 * stack.peek());
            }else if(op.equals("+")) {
                int last = stack.pop();
                int seclast = stack.peek();
                stack.push(last);
                stack.push(last + seclast);
            } else {
                stack.push(Integer.parseInt(op));
            }
        }
        int sum = 0;
        for(int x : stack) {
            sum += x;
        }
        return sum;
    }
}