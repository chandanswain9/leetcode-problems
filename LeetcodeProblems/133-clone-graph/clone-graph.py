"""
# Definition for a Node.
class Node:
    def __init__(self, val = 0, neighbors = None):
        self.val = val
        self.neighbors = neighbors if neighbors is not None else []
"""

from typing import Optional
class Solution:
    def cloneGraph(self, node: Optional['Node']) -> Optional['Node']:
        if not node:
            return None

        cloned_nodes = {}

        def dfs(original):
            if original in cloned_nodes:
                return cloned_nodes[original]

            clone = Node(original.val)
            cloned_nodes[original] = clone

            for neighbor in original.neighbors:
                clone.neighbors.append(dfs(neighbor))
            
            return clone

        return dfs(node)