public class BinaryTree {
    BinaryNode<Integer> root, current;

    BinaryTree(BinaryNode<Integer> root) {
        this.root = root;
        this.current = null;
    }

    boolean isEmpty() {
        return this.root == null;
    }

    BinaryNode<Integer> makeTree(Integer el, BinaryNode<Integer> left, BinaryNode<Integer> right) {
        BinaryNode<Integer> root = new BinaryNode<Integer>(el, left, right), temp = null;
        if (!this.isEmpty()) {
            current = this.root;
            while (current != null) {
                temp = current;
                if (el > current.el)
                    current = current.right;
                else
                    current = current.left;
            }
            if (el > temp.el)
                temp.right = root;
            else
                temp.left = root;
        } else {
            this.root = root;
        }
        return root;
    }

    void preTraversal(BinaryNode<Integer> BNode) {
        if (BNode != null) {
            System.out.print(BNode.el + ", ");
            this.preTraversal(BNode.left);
            this.preTraversal(BNode.right);
        }
    }
    void inTraversal(BinaryNode<Integer> BNode) {
        if (BNode != null) {
            inTraversal(BNode.left);
            System.out.print(BNode.el + ", ");
            inTraversal(BNode.right);
        }
    }
    void postTraversal(BinaryNode<Integer> BNode) {
        if (BNode != null) {
            inTraversal(BNode.left);
            inTraversal(BNode.right);
            System.out.print(BNode.el + ", ");
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(new BinaryNode<Integer>(90, null, null));
        tree.makeTree(30, null, null);
        // System.out.println(tree.root.right.el);
        tree.makeTree(37, null, null);
        tree.makeTree(40, null, null);
        tree.makeTree(35, null, null);
        System.out.println("preTraversal");
        tree.preTraversal(tree.root);
        System.out.println();
        System.out.println("Intraversal");
        tree.inTraversal(tree.root);
        System.out.println();
        System.out.println("PostTraversal");
        tree.postTraversal(tree.root);
        System.out.println();
    }

}
