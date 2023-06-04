public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        TreeNode element = new TreeNode(60);
        tree.insert(element, 9);
        tree.insert(element, 70);
        tree.insert(element, 3);
        tree.insert(element, 15);
        tree.insert(element, 12);
        tree.insert(element, 18);
        tree.insert(element, 70);
        System.out.println("in order");
        tree.traverseInOrder(element);
        System.out.println();
        System.out.println("pre order");
        tree.traversePreOrder(element);
        System.out.println();
        System.out.println("post order");
        tree.traversePostOrder(element);
    }
}