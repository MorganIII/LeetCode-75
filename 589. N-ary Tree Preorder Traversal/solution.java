/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        /*
        Recursive solution
        List<Integer> preorderList = new ArrayList<>();
        if (root == null) return preorderList;
        preorder(root,preorderList);
        return preorderList;
    }

    public void preorder(Node root,List<Integer> preorderList) {
        if(root.children == null) {
            preorderList.add(root.val);
            return;
        }

        preorderList.add(root.val);
        for(int i = 0; i < root.children.size(); i++){
        preorder( root.children.get(i),preorderList );
        }
        }
        */
    List<Integer> preorderList = new ArrayList<>();
    Stack<Node> stack = new Stack<Node>();
    if (root == null) return preorderList;
    stack.push(root);

    while(!stack.isEmpty()) {
        Node node = stack.pop();
        preorderList.add(node.val);

        for(int i = node.children.size() - 1; i >= 0; i--) {
            stack.push(node.children.get(i));
        }
    }
    return preorderList;
    }
}
