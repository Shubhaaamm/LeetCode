class Solution {
    private int[] parent;

    // Find function (with path compression)
    private int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]); // Path compression
        }
        return parent[x];
    }

    // Union function
    private boolean union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if (rootX == rootY) return false; // Cycle detected
        parent[rootX] = rootY;
        return true;
    }

    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        parent = new int[n + 1];

        // Initialize each node as its own parent
        for (int i = 0; i <= n; i++) {
            parent[i] = i;
        }

        // Process each edge
        for (int[] edge : edges) {
            if (!union(edge[0], edge[1])) {
                return edge; // This edge forms a cycle
            }
        }
        return new int[0]; // Should never reach here
    }
}
