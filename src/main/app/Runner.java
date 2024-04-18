package src.main.app;

import java.util.*;
import src.graph.Graph;
import src.graph.Node;

public class Runner {
    public static void main(String[] args) {
        Graph directedGraph = new Graph();
        Map<Node, List<Node>> graph = directedGraph.generateGraph();

        // Call DFS to explore the graph
        directedGraph.dfs(graph);

        // Printing the result
        for (Node node : graph.keySet()) {
            System.out.println("Node(" + node.getName() + ", " + node.getPreNumber() + ", " + 
                    node.getPostNumber() + ", " + node.getVisit() + ")");
        }
    }
}
