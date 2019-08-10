package Graph.AdjacentDirected;

@SuppressWarnings("Duplicates")
public class Main {

    public static void main(String[] args) {

        AdjacentDirectedGraph adjacentGraph = new AdjacentDirectedGraph(7);
        adjacentGraph.addVertex(0);
        adjacentGraph.addVertex(1);
        adjacentGraph.addVertex(2);
        adjacentGraph.addVertex(3);
        adjacentGraph.addVertex(4);
        adjacentGraph.addVertex(5);
        adjacentGraph.addVertex(6);
        adjacentGraph.addEdge(3, 1);
        adjacentGraph.addEdge(3, 4);
        adjacentGraph.addEdge(4, 2);
        adjacentGraph.addEdge(4, 5);
        adjacentGraph.addEdge(1, 2);
        adjacentGraph.addEdge(1, 0);
        adjacentGraph.addEdge(0, 2);
        adjacentGraph.addEdge(6, 5);

        adjacentGraph.showConnections();

        // Worst cases:
        // Adding a vertex is O(1)
        // Adding a edges is O(n)
        // Looping is O(n^2)

        // Pros: Saves space O(|V|+|E|) .
        // In the worst case, there can be C(V, 2) number of edges
        // in a graph thus consuming O(V^2) space.

        // Cons: Queries like whether there is an edge from vertex
        // u to vertex v are not efficient and can be done O(V).
    }

}
