public class Vertex {

    int n;
    String name;
    private boolean visited;
    DLinkedList<Edge> Edges;

    Vertex(int n, String name) {
        this.n = n;
        this.name = name;
        visited = false;
        Edges = new DLinkedList<>();
    }

    boolean isVisited() {
        return visited;
    }

    void visit() {
        visited = true;
    }

    void unvisit() {
        visited = false;
    }
}