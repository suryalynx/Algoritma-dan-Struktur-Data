public class LinkedListItr extends Linkedlist {
    Node curr;

    LinkedListItr() {
        curr = head;
    }

    public void advance() {
        if (curr != null) {
            curr = curr.next;
        }
    }

    public boolean isinList() {
        return (curr != null);
    }

    public boolean isLast() {
        return (curr.next == null);
    }

    public void locate(int a) {
        curr = head;
        while (curr != null) {
            if (curr.data == a) {
                break;
            }
            advance();
        }
        System.out.println(curr.data);
    }
}