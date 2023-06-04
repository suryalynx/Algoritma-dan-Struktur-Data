public class Queue extends DoubleLinkedList {
    public void enqueue(int data) {
        tambahAkhir(data);
    }

    public void dequeue() {
        hapusawal();

    }
}
