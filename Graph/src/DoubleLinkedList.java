public class DoubleLinkedList {
    Nodeloc head, tail = null;
    public void add(Object nodeloc, jalur posisi) {
        Nodeloc baru = new Nodeloc(data, posisi);
        Nodeloc curr = head;
        while (curr != null) {
            if (curr.nodeloc == posisi) {
                baru.next = curr.next;
                curr.next.next.prev = baru;
                curr.next = baru;
                baru.prev = curr;
                break;
            }
            curr = curr.next;
        }
    }

//    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }
    public void jalur(Node DoubleLinkedList){

    }

    public void liat() {
        Nodeloc curr = head;
        while (curr != null) {
            System.out.println(curr.nodeloc + " ");
            curr = curr.next;
        }
        // System.out.println();
    }
}