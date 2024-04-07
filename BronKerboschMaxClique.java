import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BronKerboschMaxClique {
    
    public static Set<Integer> bronKerbosch(Graph graph) {
        Set<Integer> clique = new HashSet<>();
        Set<Integer> candidates = new HashSet<>();
        Set<Integer> excluded = new HashSet<>();
        for (int v = 0; v < graph.getVertexCount(); v++) {
            candidates.add(v);
        }
        bronKerbosch(graph, clique, candidates, excluded);
        return clique;
    }

    private static void bronKerbosch(Graph graph, Set<Integer> clique, Set<Integer> candidates, Set<Integer> excluded) {
        if (candidates.isEmpty() && excluded.isEmpty()) {
            if (clique.size() > 2) {
                System.out.println("Clique: " + clique); // Solo para depuración
            }
            return;
        }
        
        List<Integer> candidatesList = new ArrayList<>(candidates);
        for (Integer v : candidatesList) {
            Set<Integer> neighbors = graph.getNeighbors(v);
            Set<Integer> newClique = new HashSet<>(clique);
            newClique.add(v);
            bronKerbosch(graph, newClique, intersection(candidates, neighbors), intersection(excluded, neighbors));
            candidates.remove(v);
            excluded.add(v);
        }
    }

    private static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        return intersection;
    }

    static class Graph {
        private int vertexCount;
        private List<Set<Integer>> adjacencyList;

        public Graph(int vertexCount) {
            this.vertexCount = vertexCount;
            this.adjacencyList = new ArrayList<>(vertexCount);
            for (int i = 0; i < vertexCount; i++) {
                adjacencyList.add(new HashSet<>());
            }
        }

        public int getVertexCount() {
            return vertexCount;
        }

        public void addEdge(int u, int v) {
            adjacencyList.get(u).add(v);
            adjacencyList.get(v).add(u);
        }

        public Set<Integer> getNeighbors(int v) {
            return adjacencyList.get(v);
        }
    }

    public static void main(String[] args) {
        // Crear un grafo de ejemplo
        Graph graph = new Graph(10);
        graph.addEdge(1, 3);
        graph.addEdge(1, 5);
        graph.addEdge(2, 8);
        graph.addEdge(3, 2);
        graph.addEdge(3, 5);
        graph.addEdge(3, 4);
        graph.addEdge(3, 6);
        graph.addEdge(5, 4);
        graph.addEdge(5, 6);
        graph.addEdge(5, 9);
        graph.addEdge(5, 7);
        graph.addEdge(4, 6);
        graph.addEdge(4, 2);
        graph.addEdge(8, 7);
        graph.addEdge(8, 6);
        graph.addEdge(7, 6);
        graph.addEdge(8, 9);
        graph.addEdge(9, 7);

        // Encontrar el clique máximo
        Set<Integer> maxClique = bronKerbosch(graph);
        System.out.println("Clique Máximo: " + maxClique);
    }
}
