
import java.util.Scanner;

public class Driver {
        public static void main(String[] args) {
                mainAPPS();
        }

        public static void mainAPPS() {
                Graph graph = new Graph(true);
                Vertex v1 = new Vertex(1, "BIL");
                Vertex v2 = new Vertex(2, "Praya");
                Vertex v3 = new Vertex(3, "Gerung");
                Vertex v4 = new Vertex(4, "Lembar");
                Vertex v5 = new Vertex(5, "Labuhanpon");
                Vertex v6 = new Vertex(6, "Blongas");
                Vertex v7 = new Vertex(7, "Sengkol");
                Vertex v8 = new Vertex(8, "Kuta");
                Vertex v9 = new Vertex(9, "Awang");
                Vertex v10 = new Vertex(10, "Ganti");
                Vertex v11 = new Vertex(11, "Sunut");
                Vertex v12 = new Vertex(12, "Selong");
                Vertex v13 = new Vertex(13, "Sakra");
                Vertex v14 = new Vertex(14, "Sangjang");
                Vertex v15 = new Vertex(15, "Mataram");
                Vertex v16 = new Vertex(16, "Mangsit");
                Vertex v17 = new Vertex(17, "Pamenang");
                Vertex v18 = new Vertex(18, "Tandjung");
                Vertex v19 = new Vertex(19, "Soeroengjoekoeng");
                Vertex v20 = new Vertex(20, "Salangan");
                Vertex v21 = new Vertex(21, "Bayan");
                Vertex v22 = new Vertex(22, "Sembalun Bumbung");
                Vertex v23 = new Vertex(23, "Pengadangan");
                Vertex v24 = new Vertex(24, "Pringgabaya");
                Vertex v25 = new Vertex(25, "Labuhan Lombok");
                Vertex v26 = new Vertex(26, "Sembelie");
                Vertex v27 = new Vertex(27, "Soengian");
                Vertex v28 = new Vertex(28, "Lepeloang");

                graph.addEdge(v1, v2, 14.3);
                graph.addEdge(v1, v7, 7.1);

                graph.addEdge(v2, v1, 14.3);
                graph.addEdge(v2, v3, 24.4);
                graph.addEdge(v2, v10, 15.3);

                graph.addEdge(v3, v2, 24.4);
                graph.addEdge(v3, v4, 14.4);
                graph.addEdge(v3, v15, 15.8);

                graph.addEdge(v4, v3, 14.4);
                graph.addEdge(v4, v5, 48.9);
                graph.addEdge(v4, v6, 19.9);

                graph.addEdge(v5, v4, 48.9);
                graph.addEdge(v5, v6, 33);

                graph.addEdge(v6, v4, 19.9);
                graph.addEdge(v6, v5, 33);
                graph.addEdge(v6, v8, 49.4);

                graph.addEdge(v7, v1, 7.1);
                graph.addEdge(v7, v8, 14.2);

                graph.addEdge(v8, v6, 49.4);
                graph.addEdge(v8, v7, 14.2);
                graph.addEdge(v8, v9, 17.2);

                graph.addEdge(v9, v8, 17.2);
                graph.addEdge(v9, v10, 17.7);
                graph.addEdge(v9, v11, 39.9);

                graph.addEdge(v10, v2, 15.3);
                graph.addEdge(v10, v9, 17.7);
                graph.addEdge(v10, v11, 29.9);
                graph.addEdge(v10, v12, 34.8);
                graph.addEdge(v10, v13, 19.8);

                graph.addEdge(v11, v9, 39.9);
                graph.addEdge(v11, v10, 29.9);

                graph.addEdge(v12, v10, 34.8);
                graph.addEdge(v12, v13, 7.6);
                graph.addEdge(v12, v23, 11.4);
                graph.addEdge(v12, v24, 21.7);

                graph.addEdge(v13, v10, 19.8);
                graph.addEdge(v13, v12, 7.6);
                graph.addEdge(v13, v14, 13.1);
                graph.addEdge(v13, v15, 49.2);

                graph.addEdge(v14, v13, 13.1);
                graph.addEdge(v14, v15, 40.5);

                graph.addEdge(v15, v3, 15.8);
                graph.addEdge(v15, v13, 49.2);
                graph.addEdge(v15, v14, 40.5);
                graph.addEdge(v15, v16, 17.2);

                graph.addEdge(v16, v15, 17.2);
                graph.addEdge(v16, v17, 23.9);

                graph.addEdge(v17, v16, 23.9);
                graph.addEdge(v17, v18, 9.5);

                graph.addEdge(v18, v17, 9.5);
                graph.addEdge(v18, v19, 7);

                graph.addEdge(v19, v18, 7);
                graph.addEdge(v19, v20, 21.2);

                graph.addEdge(v20, v19, 21.2);
                graph.addEdge(v20, v21, 17);

                graph.addEdge(v21, v20, 17);
                graph.addEdge(v21, v22, 37.2);
                graph.addEdge(v21, v28, 37);

                graph.addEdge(v22, v21, 37.2);
                graph.addEdge(v22, v23, 34.1);

                graph.addEdge(v23, v12, 11.4);
                graph.addEdge(v23, v22, 34.1);
                graph.addEdge(v23, v24, 20.2);

                graph.addEdge(v24, v12, 21.7);
                graph.addEdge(v24, v23, 20.2);
                graph.addEdge(v24, v25, 15.3);

                graph.addEdge(v25, v24, 15.3);
                graph.addEdge(v25, v26, 16.5);

                graph.addEdge(v26, v25, 16.5);
                graph.addEdge(v26, v27, 7.1);

                graph.addEdge(v27, v26, 7.1);
                graph.addEdge(v27, v28, 9.4);

                graph.addEdge(v28, v21, 37);
                graph.addEdge(v28, v27, 9.4);

                Scanner sc = new Scanner(System.in);
                String choose1;
                String choose2;
                String decs;
                boolean x = true;
                Vertex[] vertices = { v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18,
                                v19, v20,
                                v21, v22, v23, v24, v25, v26, v27, v28 };

                while (x == true) {
                        System.out.println(
                                        "============================ MENENTUKAN TARIF TAKSI BERDASARKAN RUTE TERPENDEK ============================");
                        System.out.println(
                                        "=============================================== Lokasi Awal ===============================================");
                        System.out.println(
                                        "1. BIL\t\t2. Praya \t\t3. Gerung\t\t 4. Lembar\t\t5. Labuhanpon");
                        System.out.println("6. Blongas\t7. Sengkol\t\t8. Kuta \t\t 9. Awang\t\t10.Ganti");
                        System.out.println("11.Sunut\t12.Selong\t\t13.Sakra \t\t 14.Sangjang\t\t15.Mataram");
                        System.out.println(
                                        "16.Mangsit\t17.Pamenang\t\t18.Tandjung \t\t 19.Soeroengjoekoeng\t20.Salangan");
                        System.out.println(
                                        "21.Bayan\t22.Sembalun Bumbung\t23.Pengadangan \t\t 24.Pringgabaya\t\t25.Labuhan Lombok");
                        System.out.println("\t\t26.Sembelie\t\t27.Soengian\t\t 28.Lepeloang\n");
                        System.out.println("\t\t\t\t\t0. Cetak Hubungan");
                        System.out.println(
                                        "===========================================================================================================");
                        System.out.print("Pilih : ");
                        choose1 = sc.nextLine();

                        if (choose1.equalsIgnoreCase("0") || choose1.equalsIgnoreCase("Cetak Hubungan")) {
                                graph.printEdges();
                                mainAPPS();
                        } else {
                                int startIndex = Integer.parseInt(choose1) - 1;
                                Vertex startVertex = vertices[startIndex];

                                System.out.println(
                                                "============================================ Lokasi Tujuan ===============================================");
                                System.out.println(
                                                "1. BIL\t\t2. Praya \t\t3. Gerung\t\t 4. Lembar\t\t5. Labuhanpon");
                                System.out.println("6. Blongas\t7. Sengkol\t\t8. Kuta \t\t 9. Awang\t\t10.Ganti");
                                System.out.println("11.Sunut\t12.Selong\t\t13.Sakra \t\t 14.Sangjang\t\t15.Mataram");
                                System.out.println(
                                                "16.Mangsit\t17.Pamenang\t\t18.Tandjung \t\t 19.Soeroengjoekoeng\t20.Salangan");
                                System.out.println(
                                                "21.Bayan\t22.Sembalun Bumbung\t23.Pengadangan \t\t 24.Pringgabaya\t\t25.Labuhan Lombok");
                                System.out.println("\t\t26.Sembelie\t\t27.Soengian\t\t 28.Lepeloang");
                                System.out.println(
                                                "===========================================================================================================");
                                System.out.print("Pilih : ");
                                choose2 = sc.nextLine();

                                int endIndex = Integer.parseInt(choose2) - 1;
                                Vertex endVertex = vertices[endIndex];
                                boolean desBol = true;
                                graph.DijkstraShortestPath(startVertex, endVertex);
                                System.out.print("Apakah Ingin Mengganti Tujuan y/n?:");

                                here: while (desBol == true) {
                                        decs = sc.next();
                                        switch (decs) {
                                                case "y":
                                                        mainAPPS();
                                                        desBol = false;
                                                        break;
                                                case "n":
                                                        desBol = false;
                                                        break;
                                                default:
                                                        System.out.println("Input Salah");
                                                        System.out.print("Masukan Ulang Innput : ");
                                                        continue here;
                                        }
                                }
                                break;
                        }
                }
        }
}
