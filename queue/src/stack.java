
public class stack extends DoubleLinkedList {
    int temp;

    public void push(int data) {
        tambahawal(data);
    }

    public void pop() {
        // temp = temp.data;
        hapusakhir();
    }

    public void top() {

    }
}
