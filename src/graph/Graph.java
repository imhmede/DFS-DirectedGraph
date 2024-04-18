package src.graph;

import java.util.*;
import src.graph.Node;

public class Graph {

    private static int NumberCounter = 1;

    // Algorithm 3: Finding all nodes reachable from a particular node
    public void explore(Map<Node, List<Node>> graph, Node v) {
        v.visit = true;
        v.preNumber = NumberCounter++;
        // previsit(v); // Optional
        for (Node u : graph.get(v)) {
            if (!u.visit) {
                explore(graph, u);
            }
        }
        v.postNumber = NumberCounter++;
        // postvisit(v); // Optional
    }

    // Algorithm 4: Depth-First Search (DFS)
    public void dfs(Map<Node, List<Node>> graph) {
        Node root = null;
        for (Node v : graph.keySet()) {
            if (v.name.equals("A")) {
                root = v;
                break;
            }
        }
        if (root != null) {
            explore(graph, root);
        }
    }


    public Map<Node, List<Node>> generateGraph() {
        Map<Node, List<Node>> graph = new HashMap<>();

        // Adding nodes and their neighbors
        Node A = new Node("A", 0, 0, false);
        Node B = new Node("B", 0, 0, false);
        Node C = new Node("C", 0, 0, false);
        Node D = new Node("D", 0, 0, false);
        Node E = new Node("E", 0, 0, false);
        Node F = new Node("F", 0, 0, false);
        Node G = new Node("G", 0, 0, false);
        Node H = new Node("H", 0, 0, false);

        graph.put(A, new ArrayList<>(Arrays.asList(B, C, F)));
        graph.put(B, new ArrayList<>(Arrays.asList(E)));
        graph.put(C, new ArrayList<>(Arrays.asList(D)));
        graph.put(D, new ArrayList<>(Arrays.asList(A, H)));
        graph.put(E, new ArrayList<>(Arrays.asList(F, G, H)));
        graph.put(F, new ArrayList<>(Arrays.asList(B, G)));
        graph.put(G, new ArrayList<>());
        graph.put(H, new ArrayList<>(Arrays.asList(G)));

        return graph;
    }
}
