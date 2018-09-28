package lesson7;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex('a');
        graph.addVertex('b');
        graph.addVertex('c');
        graph.addVertex('d');
        graph.addVertex('e');
        graph.addVertex('f');
        graph.addVertex('g');
        graph.addVertex('h');
        graph.addVertex('i');
        graph.addVertex('j');

        graph.addAdjacency(0,1,1);
        graph.addAdjacency(0,2,1);
        graph.addAdjacency(2,3,1);
        graph.addAdjacency(1,1,1);
        graph.addAdjacency(4,7,1);
        graph.addAdjacency(7,8,1);
        graph.addAdjacency(3,9,1);
        graph.addAdjacency(1,6,1);
        graph.addAdjacency(5,10,1);

    }
}