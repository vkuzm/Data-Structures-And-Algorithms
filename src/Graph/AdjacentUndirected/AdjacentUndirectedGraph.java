package Graph.AdjacentUndirected;

import java.util.LinkedList;

@SuppressWarnings("unchecked")
public class AdjacentUndirectedGraph {

    private LinkedList<Integer>[] adjacentList;

    public AdjacentUndirectedGraph(int size) {
        this.adjacentList = new LinkedList[size];
    }

    public void addVertex(int node) {
        this.adjacentList[node] = new LinkedList<>();
    }

    public void addEdge(int node1, int node2) {

        // Add an edge from src to dest.
        this.adjacentList[node1].add(node2);

        // Since graph is undirected, add an edge from dest to src also
        this.adjacentList[node2].add(node1);
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
