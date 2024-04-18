package src.graph;

public class Node {
    String name;
    int preNumber;
    int postNumber;
    boolean visit;

    public Node(String name, int preNumber, int postNumber, boolean visit) {
        this.name = name;
        this.preNumber = preNumber;
        this.postNumber = postNumber;
        this.visit = visit;
    }

    public String getName() {
        return name;
    }

    public int getPreNumber() {
        return preNumber;
    }

    public int getPostNumber() {
        return postNumber;
    }

    public boolean getVisit() {
        return visit;
    }
}

