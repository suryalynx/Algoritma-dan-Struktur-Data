public class Linkedlist {
    Node head, tail = null;

    public void tambahDataAwal(int data) {
        Node dataBaru = new Node(data);
        if (head == null) {
            head = dataBaru;
            tail = dataBaru;
        } else {
            dataBaru.next = head;
            head = dataBaru;
        }
    }

    public void tambahDataAkhir(int data) {
        Node dataBaru = new Node(data);
        if (head == null) {
            head = dataBaru;
            tail = dataBaru;
        } else {
            tail.next = dataBaru;
            tail = dataBaru;
        }
    }

    public void hapusDataAwal() {
        if (head == null) {
            return;
        } else {
            head = head.next;
        }
    }

    public void hapusDataPilihan(int data) {
        Node hapus = head;
        while (hapus.next.data != data) {
            hapus = hapus.next;
        }
        hapus.next = hapus.next.next;
    }

    public void hapusDataAkhir() {
        Node hapus = head;
        while (hapus.next.next != null) {
            hapus = hapus.next;
        }
        hapus.next = null;
        tail = hapus;
    }

    public void display() {
        Node curr = head;
        // if (head == null) {
        // System.out.println("head is null");
        // }
        while (curr != null) {
            System.out.println(curr.data + " ");
            curr = curr.next;
        }
    }
}