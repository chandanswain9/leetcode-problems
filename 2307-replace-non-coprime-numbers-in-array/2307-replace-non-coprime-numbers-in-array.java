class Solution {
    private int gcd(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> stack = new ArrayList<>();
        
        for (int num : nums) {
            stack.add(num);
            while (stack.size() > 1) {
                int x = stack.get(stack.size() - 2);
                int y = stack.get(stack.size() - 1);
                int g = gcd(x, y);
                
                if (g == 1) break;
                long lcm = (long)x / g * y;
                stack.remove(stack.size() - 1);
                stack.set(stack.size() - 1, (int)lcm);
            }
        }
        return stack;
    }
}