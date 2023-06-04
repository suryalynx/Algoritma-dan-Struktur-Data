class BinaryNode<T> {
    T el;
    BinaryNode<T> left, right;

    public BinaryNode(T el, BinaryNode<T> left, BinaryNode<T> right) {
        this.el = el;
        this.left = left;
        this.right = right;
    }
}