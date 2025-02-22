# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
def get_leaf_sequence(root: Optional[TreeNode]) -> List[int]:
        leaves = []
        def dfs(node):
            if not node:
                return
            if not node.left and not node.right:
                leaves.append(node.val)
            dfs(node.left)
            dfs(node.right)
        dfs(root)
        return leaves
class Solution:
    

    def leafSimilar(self,root1: Optional[TreeNode], root2: Optional[TreeNode]) -> bool:
        return get_leaf_sequence(root1) == get_leaf_sequence(root2)