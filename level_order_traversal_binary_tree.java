class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        
        if(root==null)
        {
            return ans;
        }
        
        Queue<TreeNode> q = new LinkedList<>();
        
        q.add(root);
        
        while(!q.isEmpty())
        {
            int s = q.size();
            
            List<Integer> list = new ArrayList<>();
            
            for(int i=0;i<s;i++)
            {
                TreeNode rem = q.remove();
                
                list.add(rem.val);
                
                if(rem.left!=null)
                {
                    q.add(rem.left);
                }
                
                if(rem.right!=null)
                {
                    q.add(rem.right);
                }
            }
            
            ans.add(list);
        }
        
        return ans;
        
    }
}
