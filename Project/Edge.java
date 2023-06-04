
public class Edge {

    Vertex source;
    Vertex destination;
    double distance;

    Edge(Vertex s, Vertex d, double w) {
        this.source = s;
        this.destination = d;
        this.distance = w;
    }

    public String toString() {
        return String.format("(%s -> %s, %f)", source.name, destination.name, distance);
    }

    public int compareTo(Edge otherEdge) {
        if (this.distance > otherEdge.distance) {
            return 1;
        } else
            return -1;
    }
}