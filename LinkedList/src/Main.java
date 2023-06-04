public class Main {
    public static void main(String[] args) {
        Linkedlist shu = new Linkedlist();
        shu.tambahDataAkhir(80);
        shu.tambahDataAkhir(2);
        shu.tambahDataAkhir(9);
        // shu.hapusDataAkhir();
        // shu.hapusDataAwal();
        shu.tambahDataAwal(90);
        shu.tambahDataAkhir(10);
        shu.hapusDataPilihan(90);
        shu.display();
    }
}
