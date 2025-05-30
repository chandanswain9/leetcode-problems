class Solution {
    private boolean hasCycle(int node, List<List<Integer>> graph, int[] visited, Stack<Integer> stack) {
        if (visited[node] == 1)
            return true;
        if (visited[node] == 2)
            return false;
        visited[node] = 1;
        for (int neighbor : graph.get(node)) {
            if (hasCycle(neighbor, graph, visited, stack)) {
                return true;
            }
        }
        visited[node] = 2;
        stack.push(node);
        return false;
    }

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] pre : prerequisites) {
            int course = pre[0], prereq = pre[1];
            graph.get(prereq).add(course);
        }
        int[] visited = new int[numCourses];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < numCourses; i++) {
            if (hasCycle(i, graph, visited, stack)) {
                return new int[0];
            }
        }
        int[] res = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            res[i] = stack.pop();
        }
        return res;
    }
}