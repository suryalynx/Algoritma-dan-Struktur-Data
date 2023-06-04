
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
    Node InsertNth(Node head, int data, int position) {
        // This is a "method-only" submission. 
         // You only need to complete this method. 
         Node node = new Node();
         node.data = data;
         node.next = null;
         if(head == null){
             return head = node;
         }
         else if(position == 0){
             node.next = head;
             head = node;
             return head;
         }
         else{
             Node cur = head;
             for(int i=0; i<position-1; i++){
                 cur = cur.next;
             }
             node.next = cur.next;
             cur.next = node;
             return head;
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
        Node hapus;
        hapus = head;
        if (head.data == data) {
            hapusDataAwal();
        } else {
            while (hapus.next.data != data) {
                // System.out.println(hapus.data);
                hapus = hapus.next;
            }
            hapus.next = hapus.next.next;
        }
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