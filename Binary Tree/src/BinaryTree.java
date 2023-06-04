import com.sun.source.tree.Tree;

public class BinaryTree {

    public void ins(TreeNode node, int root){

    }
    public void insert(TreeNode node, int root) {
        if (root < node.root) {
            if (node.left != null) {
                insert(node.left, root);
            } else {
                node.left = new TreeNode(root);
            }
        } else if (root > node.root) {
            if (node.right != null) {
                insert(node.right, root);
            } else {
                node.right = new TreeNode(root);
            }
        }
    }
    public void traverseInOrder(TreeNode node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.root);
            traverseInOrder(node.right);
        }
    }
    public void traversePreOrder(TreeNode node) {
        if (node != null) {
            System.out.print(" " + node.root);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    public void traversePostOrder(TreeNode node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.root);
        }
    }
}
