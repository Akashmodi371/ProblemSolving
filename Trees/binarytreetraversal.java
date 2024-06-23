public class binarytreetraversal {
    public class TreeNode {
            int val;
            TreeNode left;
           TreeNode right;
            TreeNode() {}
            TreeNode(int val) { this.val = val; }
           TreeNode(int val, TreeNode left, TreeNode right) {
                this.val = val;
                this.left = left;
                this.right = right;
            }
    }


    static ArrayList<Integer> topView(Node root)
    {
        Queue<Pair> q=new LinkedList<>();
        Map<Integer,Integer>mp=new TreeMap<>();
        ArrayList<Integer>ans=new ArrayList<>();
        q.add(new Pair(0,root));
        
        while(!q.isEmpty()){
            Pair curr=q.poll();
            
            if(!mp.containsKey(curr.hd)){
                mp.put(curr.hd,curr.node.data);
            }
            
            if(curr.node.left!=null){
                q.add(new Pair(curr.hd-1,curr.node.left));
            }
            if(curr.node.right!=null){
                q.add(new Pair(curr.hd+1,curr.node.right));
            }
        }
        
        for(Map.Entry<Integer,Integer> m:mp.entrySet()){
            ans.add(m.getValue());
        }
        
        return ans;
        
    }



            
}
