
        
      
class Solution:
    def isCousins(self, root: TreeNode, x: int, y: int) -> bool:
        stack =[(root,0,root.val)]
        cousinx= None
        cousiny= None
        for node, k, parent in stack:
            if node.left:
                stack.append((node.left,k+1,node.val))
            if node.right:
                stack.append((node.right,k+1,node.val))
            if node.val==x:
                cousinx=(node,k,parent)
            if node.val==y:
                cousiny=(node,k,parent)
            if cousinx and cousiny and cousinx[1]==cousiny[1] and cousinx[2]!=cousiny[2]:
                return True
        return False    
            
        