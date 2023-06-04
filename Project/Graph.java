import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Graph {
    private Set<Vertex> nodes;
    private boolean directed;

    Graph(boolean directed) {
        this.directed = directed;
        nodes = new HashSet<>();
    }

    public void addEdge(Vertex source, Vertex destination, double distance) {
        nodes.add(source);
        nodes.add(destination);
        addEdgeHelper(source, destination, distance);

        if (!directed && source != destination) {
            addEdgeHelper(destination, source, distance);
        }
    }

    private void addEdgeHelper(Vertex a, Vertex b, double distance) {
        for (int i = 0; i < a.Edges.size(); i++) {
            Edge edge = a.Edges.get(i);
            if (edge.source == a && edge.destination == b) {
                edge.distance = distance;
                return;
            }
        }
        a.Edges.insert(new Edge(a, b, distance));
    }

    public void printEdges() {
        for (Vertex node : nodes) {
            DLinkedList<Edge> Edges = node.Edges;
            if (Edges.isEmpty()) {
                System.out.println(node.name + " Tidak Terhubung Dengan Apapun :");
                continue;
            }
            System.out.print(node.name + " Terhubung Dengan ==> ");
            for (int i = 0; i < Edges.size(); i++) {
                Edge edge = Edges.get(i);
                System.out.print(edge.destination.name + ", ");
            }
            System.out.println();
        }
    }

    public void DijkstraShortestPath(Vertex start, Vertex end) {
        HashMap<Vertex, Vertex> changedAt = new HashMap<>();
        changedAt.put(start, null);
        HashMap<Vertex, Double> shortestPathMap = new HashMap<>();
        for (Vertex node : nodes) {
            if (node == start)
                shortestPathMap.put(start, 0.0);
            else
                shortestPathMap.put(node, Double.POSITIVE_INFINITY);
        }
        for (int i = 0; i < start.Edges.size(); i++) {
            Edge edge = start.Edges.get(i);
            shortestPathMap.put(edge.destination, edge.distance);
            changedAt.put(edge.destination, start);
        }
        start.visit();
        while (true) {
            Vertex currentNode = closestReachableUnvisited(shortestPathMap);
            if (currentNode == null) {
                System.out.println("Tidak Ada Jalur Antara " + start.name + " dan " + end.name);
                return;
            }
            if (currentNode == end) {
                System.out.println("Rute Terdekat Antara "
                        + start.name + " dan " + end.name + " adalah");
                Vertex child = end;
                String path = end.name;
                while (true) {
                    Vertex parent = changedAt.get(child);
                    if (parent == null) {
                        break;
                    }
                    child = parent;
                    path = parent.name + " ==> " + path;
                }
                System.out.println(path);
                System.out.printf("Dengan Jarak %.2f Km\n", shortestPathMap.get(end));
                System.out.printf("Dengan Tarif: Rp %.2f \n", shortestPathMap.get(end) * 4600);
                return;
            }
            currentNode.visit();
            for (int i = 0; i < currentNode.Edges.size(); i++) {
                Edge edge = currentNode.Edges.get(i);
                Vertex destination = edge.destination;
                if (!destination.isVisited()) {
                    double newDistance = shortestPathMap.get(currentNode) + edge.distance;
                    if (newDistance < shortestPathMap.get(destination)) {
                        shortestPathMap.put(destination, newDistance);
                        changedAt.put(destination, currentNode);
                    }
                }
            }
        }
    }

    private Vertex closestReachableUnvisited(HashMap<Vertex, Double> shortestPathMap) {

        double shortestDistance = Double.POSITIVE_INFINITY;
        Vertex closestReachableNode = null;
        for (Vertex node : nodes) {
            if (node.isVisited())
                continue;

            double currentDistance = shortestPathMap.get(node);
            if (currentDistance == Double.POSITIVE_INFINITY)
                continue;

            if (currentDistance < shortestDistance) {
                shortestDistance = currentDistance;
                closestReachableNode = node;
            }
        }
        return closestReachableNode;
    }
}