public class DLinkedList<T> {
    private class Node<T> {
        T data;
        Node<T> next;
        Node<T> prev;

        Node(T data) {
            this.data = data;
            next = null;
            prev = null;
        }
    }

    private Node<T> head;
    private Node<T> tail;

    public DLinkedList() {
        head = null;
        tail = null;
    }

    public void insert(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public boolean isEmpty() {
        // jika null akan return true
        if (this.head == null) {
            return true;
        }
        // selain daripada itu, maka false
        return false;
    }

    public int size() {
        int size = 0;
        Node<T> current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    public T get(int i) {
        // Check if the index is out of bounds
        if (i < 0 || i >= size()) {
            throw new IndexOutOfBoundsException();
        }

        // Iterate through the list and find the element at the specified index
        Node<T> current = head;
        for (int j = 0; j < i; j++) {
            current = current.next;
        }

        return current.data;
    }
}
