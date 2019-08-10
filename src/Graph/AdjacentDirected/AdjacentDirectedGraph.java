package Graph.AdjacentDirected;

import java.util.LinkedList;

@SuppressWarnings({"unchecked", "Duplicates"})
public class AdjacentDirectedGraph {

    private LinkedList<Integer>[] adjacentList;

    public AdjacentDirectedGraph(int size) {
        this.adjacentList = new LinkedList[size];
    }

    public void addVertex(int node) {
        this.adjacentList[node] = new LinkedList<>();
    }

    public void addEdge(int node1, int node2) {

        // Add an edge from src to dest.
        this.adjacentList[node1].add(node2);
    }

    public void showConnections() {
        for (int node = 0; node < this.adjacentList.length; node++) {
            LinkedList<Integer> nodeConnections = this.adjacentList[node];

            String connections = "";
            for (int vertex : nodeConnections) {
                connections += vertex + " ";
            }

            System.out.println(node + "--> " + connections);
        }

    }

}
