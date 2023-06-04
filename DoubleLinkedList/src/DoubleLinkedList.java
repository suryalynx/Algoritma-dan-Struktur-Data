public class DoubleLinkedList {
    Node head, tail = null;

    public void tambahawal(int data) {
        Node dataBaru = new Node(data);
        if (head == null) {
            head = dataBaru;
            tail = dataBaru;
        } else {
            dataBaru.next = head;
            head.prev = dataBaru;
            head = dataBaru;
        }
    }

    public void tambahSerah(int data, int posisi) {
        Node baru = new Node(data);
        Node curr = head;
        while (curr != null) {
            if (curr.data == posisi) {
                baru.next = curr.next;
                curr.next.next.prev = baru;
                curr.next = baru;
                baru.prev = curr;
                break;
            }
            curr = curr.next;
        }
    }

    public void tambahAkhir(int data) {
        Node dataBaru = new Node(data);
        if (head == null) {
            head = tail = dataBaru;
            head.prev = null;
            tail.next = null;
        } else {
            tail.next = dataBaru;
            dataBaru.prev = tail;
            tail = dataBaru;
            tail.next = null;
        }
    }

    public void hapusawal() {
        if (head == null) {
            return;
        } else {
            head = head.next;
        }
    }

    public void hapussetelah(int data) {
        Node node = head;
        while (node != null) {
            if (node.next.data == data) {
                node.next = node.next.next;
                node.next.prev = node;
                break;
            }
            node = node.next;
        }
    }

    public void hapusakhir() {
        if (head == null) {
            return;
        } else {
            if (head != tail) {
                tail = tail.prev;
                tail.next = null;
            } else {
                head = tail = null;
            }
        }
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    public void liat() {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.data + " ");
            curr = curr.next;
        }
        // System.out.println();
    }
}