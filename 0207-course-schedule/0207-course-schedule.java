class Solution {
    private boolean hasCycle(int course, List<List<Integer>> graph, int[] visited) {
        if(visited[course] == 1) return true;
        if(visited[course] == 2) return false;

        visited[course] = 1;
        for(int neighbor : graph.get(course)) {
            if(hasCycle(neighbor, graph, visited)) {
                return true;
            }
        }

        visited[course] = 2;
        return false;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();

        for(int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }
        for(int[] pre : prerequisites) {
            int course = pre[0], prereq = pre[1];
            graph.get(prereq).add(course);
        }

        int[] visited = new int[numCourses];
        for(int i = 0; i < numCourses; i++) {
            if(hasCycle(i, graph, visited)) {
                return false;
            }
        }
        return true;
    }
}